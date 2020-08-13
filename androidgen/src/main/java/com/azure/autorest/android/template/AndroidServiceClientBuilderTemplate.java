package com.azure.autorest.android.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.AsyncSyncClient;
import com.azure.autorest.model.clientmodel.ClassType;
import com.azure.autorest.model.clientmodel.ServiceClient;
import com.azure.autorest.model.clientmodel.ServiceClientProperty;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.template.ServiceClientBuilderTemplate;
import com.azure.autorest.util.ClientModelUtil;
import com.azure.autorest.util.CodeNamer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AndroidServiceClientBuilderTemplate extends ServiceClientBuilderTemplate {
    private static AndroidServiceClientBuilderTemplate _instance = new AndroidServiceClientBuilderTemplate();

    protected AndroidServiceClientBuilderTemplate() {
    }

    public static ServiceClientBuilderTemplate getInstance() {
        return _instance;
    }

    @Override
    public void write(ServiceClient serviceClient, JavaFile javaFile) {
        JavaSettings settings = JavaSettings.getInstance();
        String serviceClientBuilderName = serviceClient.getInterfaceName() + ClientModelUtil.getBuilderSuffix();

        ArrayList<ServiceClientProperty> commonProperties = new ArrayList<ServiceClientProperty>();
        commonProperties
                .add(new ServiceClientProperty("The Service client to use for REST call",
                        ClassType.AndroidServiceClient,
                        "serviceClient",
                        false,
                        "new ServiceClient.Builder().build()"));

        String buildReturnType;
        if (settings.shouldGenerateClientInterfaces()) {
            buildReturnType = serviceClient.getInterfaceName();
        } else {
            buildReturnType = serviceClient.getClassName();
        }

        Set<String> imports = new HashSet<String>();
        serviceClient.addImportsTo(imports, false, true, settings);
        commonProperties.stream().forEach(p -> p.addImportsTo(imports, false));

        List<AsyncSyncClient> asyncClients = new ArrayList<>();
        List<AsyncSyncClient> syncClients = new ArrayList<>();
        if (JavaSettings.getInstance().shouldGenerateSyncAsyncClients()) {
            ClientModelUtil.getAsyncSyncClients(serviceClient, asyncClients, syncClients);
        }
        final boolean singleBuilder = asyncClients.size() == 1;

        StringBuilder builderTypes = new StringBuilder();
        builderTypes.append("{");
        if (JavaSettings.getInstance().shouldGenerateSyncAsyncClients()) {
            List<AsyncSyncClient> clients = new ArrayList<>(asyncClients);
            clients.addAll(syncClients);
            boolean first = true;
            for (AsyncSyncClient client : clients) {
                if (first) {
                    first = false;
                } else {
                    builderTypes.append(", ");
                }
                builderTypes.append(client.getClassName()).append(".class");
            }
        } else {
            builderTypes.append(serviceClient.getClassName()).append(".class");
        }
        builderTypes.append("}");
        javaFile.declareImport(imports);

        javaFile.javadocComment(comment ->
        {
            String serviceClientTypeName = settings.isFluent() ? serviceClient.getClassName() : serviceClient.getInterfaceName();
            comment.description(String.format("A builder for creating a new instance of the %1$s type.", serviceClientTypeName));
        });

        javaFile.publicFinalClass(serviceClientBuilderName, classBlock ->
        {
            // Add ServiceClient client property variables, getters, and setters
            for (ServiceClientProperty serviceClientProperty : Stream
                    .concat(serviceClient.getProperties().stream().filter(p -> !p.isReadOnly()), commonProperties.stream()).collect(Collectors.toList())) {
                classBlock.blockComment(settings.getMaximumJavadocCommentWidth(), comment ->
                {
                    comment.line(serviceClientProperty.getDescription());
                });
                classBlock.privateMemberVariable(String.format("%1$s %2$s", serviceClientProperty.getType(), serviceClientProperty.getName()));

                classBlock.javadocComment(comment ->
                {
                    comment.description(String.format("Sets %1$s", serviceClientProperty.getDescription()));
                    comment.param(serviceClientProperty.getName(), String.format("the %1$s value.", serviceClientProperty.getName()));
                    comment.methodReturns(String.format("the %1$s", serviceClientBuilderName));
                });
                classBlock.publicMethod(String.format("%1$s %2$s(%3$s %4$s)", serviceClientBuilderName, CodeNamer.toCamelCase(serviceClientProperty.getName()), serviceClientProperty.getType(), serviceClientProperty.getName()), function ->
                {
                    function.line(String.format("this.%1$s = %2$s;", serviceClientProperty.getName(), serviceClientProperty.getName()));
                    function.methodReturn("this");
                });
            }

            String buildMethodName = this.primaryBuildMethodName(settings);
            JavaVisibility visibility = settings.shouldGenerateSyncAsyncClients() ? JavaVisibility.Private : JavaVisibility.Public;

            // build method
            classBlock.javadocComment(comment ->
            {
                comment.description(String.format("Builds an instance of %1$s with the provided parameters", buildReturnType));
                comment.methodReturns(String.format("an instance of %1$s", buildReturnType));
            });
            classBlock.method(visibility, null, String.format("%1$s %2$s()", buildReturnType, buildMethodName), function ->
            {
                for (ServiceClientProperty serviceClientProperty : Stream.concat(serviceClient.getProperties().stream().filter(p -> !p.isReadOnly()), commonProperties.stream()).collect(Collectors.toList())) {
                    if (serviceClientProperty.getDefaultValueExpression() != null) {
                        function.ifBlock(String.format("%1$s == null", serviceClientProperty.getName()), ifBlock ->
                        {
                            function.line(String.format("this.%1$s = %2$s;", serviceClientProperty.getName(), serviceClientProperty.getDefaultValueExpression()));
                        });
                    }
                }

                // additional service client properties in constructor arguments
                String constructorArgs = serviceClient.getProperties().stream()
                        .filter(p -> !p.isReadOnly())
                        .map(ServiceClientProperty::getName)
                        .collect(Collectors.joining(", "));
                if (!constructorArgs.isEmpty()) {
                    constructorArgs = ", " + constructorArgs;
                }

                function.line(String.format("%1$s client = new %2$s(serviceClient%3$s);", serviceClient.getClassName(), serviceClient.getClassName(), constructorArgs));
                function.line("return client;");
            });

            if (JavaSettings.getInstance().shouldGenerateSyncAsyncClients()) {
                for (AsyncSyncClient asyncClient : asyncClients) {
                    final boolean wrapServiceClient = asyncClient.getMethodGroupClient() == null;

                    classBlock.javadocComment(comment ->
                    {
                        comment.description(String
                                .format("Builds an instance of %1$s async client", asyncClient.getClassName()));
                        comment.methodReturns(String.format("an instance of %1$s", asyncClient.getClassName()));
                    });
                    classBlock.publicMethod(String.format("%1$s build%2$s()", asyncClient.getClassName(), singleBuilder ? "AsyncClient" : asyncClient.getClassName()),
                            function -> {
                                if (wrapServiceClient) {
                                    function.line("return new %1$s(%2$s());", asyncClient.getClassName(), buildMethodName);
                                } else {
                                    function.line("return new %1$s(%2$s().get%3$s());", asyncClient.getClassName(), buildMethodName,
                                            CodeNamer.toPascalCase(asyncClient.getMethodGroupClient().getVariableName()));
                                }
                            });
                }

                for (AsyncSyncClient syncClient : syncClients) {
                    final boolean wrapServiceClient = syncClient.getMethodGroupClient() == null;

                    classBlock.javadocComment(comment ->
                    {
                        comment.description(String
                                .format("Builds an instance of %1$s sync client", syncClient.getClassName()));
                        comment.methodReturns(String.format("an instance of %1$s", syncClient.getClassName()));
                    });
                    classBlock.publicMethod(String.format("%1$s build%2$s()", syncClient.getClassName(), singleBuilder ? "Client" : syncClient.getClassName()),
                            function -> {
                                if (wrapServiceClient) {
                                    function.line("return new %1$s(%2$s());", syncClient.getClassName(), buildMethodName);
                                } else {
                                    function.line("return new %1$s(%2$s().get%3$s());", syncClient.getClassName(), buildMethodName,
                                            CodeNamer.toPascalCase(syncClient.getMethodGroupClient().getVariableName()));
                                }
                            });
                }
            }
        });

    }

    /**
     * Extension for the name of build method.
     *
     * @return The name of build method.
     */
    protected String primaryBuildMethodName(JavaSettings settings) {
        return settings.shouldGenerateSyncAsyncClients()
                ? "buildInnerClient"
                : "buildClient";
    }
}