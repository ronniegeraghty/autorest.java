// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.customization;

import com.azure.autorest.customization.implementation.ls.EclipseLanguageClient;
import com.azure.autorest.customization.implementation.ls.models.SymbolInformation;

import java.net.URI;

/**
 * Base class for all code based customizations.
 */
public abstract class CodeCustomization {
    final Editor editor;
    final EclipseLanguageClient languageClient;
    final SymbolInformation symbol;
    final URI fileUri;
    final String fileName;

    CodeCustomization(Editor editor, EclipseLanguageClient languageClient, SymbolInformation symbol) {
        this.editor = editor;
        this.languageClient = languageClient;
        this.symbol = symbol;
        this.fileUri = symbol.getLocation().getUri();
        int i = fileUri.toString().indexOf("src/main/java/");
        this.fileName = fileUri.toString().substring(i);
    }

    /**
     * The Editor managing the state of the CodeCustomization.
     *
     * @return The Editor.
     */
    public final Editor getEditor() {
        return editor;
    }

    /**
     * The EclipseLanguageClient managing validation of the CodeCustomization.
     *
     * @return The EclipseLanguageClient.
     */
    public final EclipseLanguageClient getLanguageClient() {
        return languageClient;
    }

    /**
     * The SymbolInformation managing information about the CodeCustomization.
     *
     * @return The SymbolInformation.
     */
    public final SymbolInformation getSymbol() {
        return symbol;
    }

    /**
     * The URI of the file containing where the code for the CodeCustomization exists.
     *
     * @return The URI of the file.
     */
    public final URI getFileUri() {
        return fileUri;
    }

    /**
     * The name of the file containing where the code for the CodeCustomization exists.
     *
     * @return The name of the file.
     */
    public final String getFileName() {
        return fileName;
    }
}
