// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodystring;

import com.azure.core.util.ServiceVersion;

/** Service version of AutoRestSwaggerBatServiceClient. */
public enum AutoRestSwaggerBatServiceVersion implements ServiceVersion {
    /** Enum value 1.0.0. */
    V1_0_0("1.0.0");

    private final String version;

    AutoRestSwaggerBatServiceVersion(String version) {
        this.version = version;
    }

    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link AutoRestSwaggerBatServiceVersion}.
     */
    public static AutoRestSwaggerBatServiceVersion getLatest() {
        return V1_0_0;
    }
}
