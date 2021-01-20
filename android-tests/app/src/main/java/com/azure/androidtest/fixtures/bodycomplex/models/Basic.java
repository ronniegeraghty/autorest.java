package com.azure.androidtest.fixtures.bodycomplex.models;

import com.azure.android.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Basic model.
 */
@Fluent
public final class Basic {
    /*
     * Basic Id
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * Name property with a very long description that does not fit on a single
     * line and a line break.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The color property.
     */
    @JsonProperty(value = "color")
    private CMYKColors color;

    /**
     * Get the id property: Basic Id.
     * 
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: Basic Id.
     * 
     * @param id the id value to set.
     * @return the Basic object itself.
     */
    public Basic setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Name property with a very long description that
     * does not fit on a single line and a line break.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name property with a very long description that
     * does not fit on a single line and a line break.
     * 
     * @param name the name value to set.
     * @return the Basic object itself.
     */
    public Basic setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the color property: The color property.
     * 
     * @return the color value.
     */
    public CMYKColors getColor() {
        return this.color;
    }

    /**
     * Set the color property: The color property.
     * 
     * @param color the color value to set.
     * @return the Basic object itself.
     */
    public Basic setColor(CMYKColors color) {
        this.color = color;
        return this;
    }
}
