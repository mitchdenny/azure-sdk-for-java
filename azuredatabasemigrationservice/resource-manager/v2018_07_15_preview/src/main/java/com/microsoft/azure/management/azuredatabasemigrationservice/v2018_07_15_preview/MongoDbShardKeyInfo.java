/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a MongoDB shard key.
 */
public class MongoDbShardKeyInfo {
    /**
     * The fields within the shard key.
     */
    @JsonProperty(value = "fields", required = true)
    private List<MongoDbShardKeyField> fields;

    /**
     * Whether the shard key is unique.
     */
    @JsonProperty(value = "isUnique", required = true)
    private boolean isUnique;

    /**
     * Get the fields within the shard key.
     *
     * @return the fields value
     */
    public List<MongoDbShardKeyField> fields() {
        return this.fields;
    }

    /**
     * Set the fields within the shard key.
     *
     * @param fields the fields value to set
     * @return the MongoDbShardKeyInfo object itself.
     */
    public MongoDbShardKeyInfo withFields(List<MongoDbShardKeyField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get whether the shard key is unique.
     *
     * @return the isUnique value
     */
    public boolean isUnique() {
        return this.isUnique;
    }

    /**
     * Set whether the shard key is unique.
     *
     * @param isUnique the isUnique value to set
     * @return the MongoDbShardKeyInfo object itself.
     */
    public MongoDbShardKeyInfo withIsUnique(boolean isUnique) {
        this.isUnique = isUnique;
        return this;
    }

}
