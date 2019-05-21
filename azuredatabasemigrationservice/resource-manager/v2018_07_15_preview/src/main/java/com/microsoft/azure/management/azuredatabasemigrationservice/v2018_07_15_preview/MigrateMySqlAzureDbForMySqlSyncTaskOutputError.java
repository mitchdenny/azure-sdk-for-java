/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateMySqlAzureDbForMySqlSyncTaskOutputError model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("ErrorOutput")
public class MigrateMySqlAzureDbForMySqlSyncTaskOutputError extends MigrateMySqlAzureDbForMySqlSyncTaskOutput {
    /**
     * Migration error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ReportableException error;

    /**
     * Get migration error.
     *
     * @return the error value
     */
    public ReportableException error() {
        return this.error;
    }

}
