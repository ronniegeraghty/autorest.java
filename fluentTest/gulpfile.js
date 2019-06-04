var path = require('path');
var gulp = require('gulp');
var args = require('yargs').argv;
var colors = require('colors');
var execa = require('execa');
var pAll = require('p-all');
var os = require('os');
var fs = require('fs');
var shell = require('gulp-shell');
var ghPages = require('gulp-gh-pages');
var argv = require('yargs').argv;
var gulpif = require('gulp-if');
var exec = require('child_process').exec;

const mappings = require('./test-specs.json');
const testSpecsRoot = ".";

gulp.task('default', function() {
    console.log("Usage: gulp codegen " +
        "[--debug] " +
        "[--parallel <number>] " +
        "[--autorest-args <AutoRest arguments>]\n");

    console.log("--debug");
    console.log("\tFlag that allows you to attach a debugger to the autorest.java generator.");

    console.log("--parallel");
    console.log("\tSpecifies the maximum number of projects to generate in parallel.");
    console.log("\tDefaults to the number of logical CPUs on the system. (On this system, " + os.cpus().length + ")");

    console.log("--autorest-args");
    console.log("\tPasses additional argument to AutoRest generator");
});

const maxParallelism = parseInt(args['parallel'], 10) || os.cpus().length;
var specRoot = testSpecsRoot;
var projects = undefined;
var autoRestVersion = 'latest'; // default
if (args['autorest'] !== undefined) {
    autoRestVersion = args['autorest'];
}
var debug = args['debug'];
var autoRestArgs = args['autorest-args'] || '';
var autoRestExe;

gulp.task('codegen', function(cb) {
    if (autoRestVersion.match(/[0-9]+\.[0-9]+\.[0-9]+.*/) ||
        autoRestVersion == 'latest') {
            autoRestExe = 'autorest ---version=' + autoRestVersion;
            handleInput(projects, cb);
    } else {
        autoRestExe = "node " + path.join(autoRestVersion, "src/autorest-core/dist/app.js");
        handleInput(projects, cb);
    }
});

var handleInput = function(projects, cb) {
    console.info(`Generating up to ${maxParallelism} projects in parallel..`);
    const actions = Object.keys(mappings).map(proj => {
        return () => codegen(proj, cb);
    });
    pAll(actions, { concurrency: maxParallelism });
}

var codegen = function(project, cb) {
    if (!args['preserve']) {
        deleteFolderRecursive(project);
    }

    console.log(path.resolve(process.cwd() + '/..'));

    console.log('Generating "' + project + '" from spec file ' + specRoot + '/' + mappings[project].source);

    const generatorPath =  `--use=${path.resolve(process.cwd() + '/..')}`; //args['autorest-java'] ? `--use=${path.resolve(args['autorest-java'])} ` : '';

    const regenManager = args['regenerate-manager'] ? ' --regenerate-manager=true ' : '';

    const genInterface = args['generate-interface'] ? ' --generate-interface=true ' : '';

    var apiVersion;
    if (mappings[project].apiVersion !== undefined) {
        apiVersion = " --api-version='" + mappings[project].apiVersion + "'" + ' ';
    } else {
        apiVersion = '';
    }

    var fconfig; 
    if (mappings[project].fconfig !== undefined) {
        fconfig = " --fconfig='" + JSON.stringify(mappings[project].fconfig) + "'" + ' ';
    } else {
        fconfig = '';
    }

    // path.join won't work if specRoot is a URL
    cmd = autoRestExe + ' ' + specRoot + "/" + mappings[project].source +
                        ' --java ' +
                        ' --azure-arm ' +
                        ' --fluent-test-folder=' + process.cwd() + ' ' +
                        ' --generate-test=false' +
                        ` --license-header=MICROSOFT_MIT_NO_CODEGEN ` +
                        generatorPath +
                        regenManager +
                        genInterface +
                        apiVersion +
                        fconfig + 
                        autoRestArgs;

    if (mappings[project].args !== undefined) {
        cmd += ' ' + mappings[project].args;
    }

    if (debug) {
        cmd += ' --java.debugger';
    }

    console.log('Command: ' + cmd);
    return execa(cmd, [], { shell: true, stdio: "inherit" });
};

var deleteFolderRecursive = function(folder) {
    var header = "Code generated by Microsoft (R) AutoRest Code Generator";
    if(fs.existsSync(folder)) {
        fs.readdirSync(folder).forEach(function(file, index) {
            var curPath = folder + "/" + file;
            if(fs.lstatSync(curPath).isDirectory()) {
                if (file == 'test') {
                    // Do not delete assets in the test directory
                    return;
                } else {
                    deleteFolderRecursive(curPath);
                }
            } else {
                var content = fs.readFileSync(curPath).toString('utf8');
                if (content.indexOf(header) > -1) {
                    fs.unlinkSync(curPath);
                }
            }
        });
    }
};