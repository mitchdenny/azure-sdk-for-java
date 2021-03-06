/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata associated with the operation.
 */
public class OperationDisplay {
    /**
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * The name of the provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The name of the resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The type of operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the operation.
     *
     * @param description the description value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the name of the provider.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the name of the provider.
     *
     * @param provider the provider value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the name of the resource type on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the name of the resource type on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the type of operation: get, read, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the type of operation: get, read, delete, etc.
     *
     * @param operation the operation value to set
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

}
