// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The MyBaseType model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = MyBaseType.class)
@JsonTypeName("MyBaseType")
@JsonSubTypes({@JsonSubTypes.Type(name = "Kind1", value = MyDerivedType.class)})
@JsonFlatten
@Fluent
public class MyBaseType {
    /*
     * The propB1 property.
     */
    @JsonProperty(value = "propB1")
    private String propB1;

    /*
     * The propBH1 property.
     */
    @JsonProperty(value = "helper.propBH1")
    private String propBH1;

    /**
     * Get the propB1 property: The propB1 property.
     *
     * @return the propB1 value.
     */
    public String getPropB1() {
        return this.propB1;
    }

    /**
     * Set the propB1 property: The propB1 property.
     *
     * @param propB1 the propB1 value to set.
     * @return the MyBaseType object itself.
     */
    public MyBaseType setPropB1(String propB1) {
        this.propB1 = propB1;
        return this;
    }

    /**
     * Get the propBH1 property: The propBH1 property.
     *
     * @return the propBH1 value.
     */
    public String getPropBH1() {
        return this.propBH1;
    }

    /**
     * Set the propBH1 property: The propBH1 property.
     *
     * @param propBH1 the propBH1 value to set.
     * @return the MyBaseType object itself.
     */
    public MyBaseType setPropBH1(String propBH1) {
        this.propBH1 = propBH1;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
