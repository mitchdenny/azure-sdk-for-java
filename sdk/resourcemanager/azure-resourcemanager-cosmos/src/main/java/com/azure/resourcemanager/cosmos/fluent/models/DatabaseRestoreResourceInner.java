// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specific Databases to restore. */
@Fluent
public final class DatabaseRestoreResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseRestoreResourceInner.class);

    /*
     * The name of the database available for restore.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * The names of the collections available for restore.
     */
    @JsonProperty(value = "collectionNames")
    private List<String> collectionNames;

    /**
     * Get the databaseName property: The name of the database available for restore.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database available for restore.
     *
     * @param databaseName the databaseName value to set.
     * @return the DatabaseRestoreResourceInner object itself.
     */
    public DatabaseRestoreResourceInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the collectionNames property: The names of the collections available for restore.
     *
     * @return the collectionNames value.
     */
    public List<String> collectionNames() {
        return this.collectionNames;
    }

    /**
     * Set the collectionNames property: The names of the collections available for restore.
     *
     * @param collectionNames the collectionNames value to set.
     * @return the DatabaseRestoreResourceInner object itself.
     */
    public DatabaseRestoreResourceInner withCollectionNames(List<String> collectionNames) {
        this.collectionNames = collectionNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
