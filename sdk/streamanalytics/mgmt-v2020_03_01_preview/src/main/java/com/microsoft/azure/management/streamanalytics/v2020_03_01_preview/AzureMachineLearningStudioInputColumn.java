/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an input column for the Azure Machine Learning Studio endpoint.
 */
public class AzureMachineLearningStudioInputColumn {
    /**
     * The name of the input column.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The (Azure Machine Learning supported) data type of the input column. A
     * list of valid  Azure Machine Learning data types are described at
     * https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * The zero based index of the function parameter this input maps to.
     */
    @JsonProperty(value = "mapTo")
    private Integer mapTo;

    /**
     * Get the name of the input column.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the input column.
     *
     * @param name the name value to set
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the (Azure Machine Learning supported) data type of the input column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the (Azure Machine Learning supported) data type of the input column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     *
     * @param dataType the dataType value to set
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the zero based index of the function parameter this input maps to.
     *
     * @return the mapTo value
     */
    public Integer mapTo() {
        return this.mapTo;
    }

    /**
     * Set the zero based index of the function parameter this input maps to.
     *
     * @param mapTo the mapTo value to set
     * @return the AzureMachineLearningStudioInputColumn object itself.
     */
    public AzureMachineLearningStudioInputColumn withMapTo(Integer mapTo) {
        this.mapTo = mapTo;
        return this;
    }

}
