// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.customheaderdeserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/** The HeadersResponseDateHeaders model. */
@Fluent
public final class HeadersResponseDateHeaders {
    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private LocalDate value;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of HeadersResponseDateHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public HeadersResponseDateHeaders(HttpHeaders rawHeaders) {
        if (rawHeaders.getValue("value") != null) {
            this.value = LocalDate.parse(rawHeaders.getValue("value"));
        }
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public LocalDate getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the HeadersResponseDateHeaders object itself.
     */
    public HeadersResponseDateHeaders setValue(LocalDate value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
