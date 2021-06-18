// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.ai.metricsadvisor.administration.models.MetricAnomalyAlertSnoozeCondition;
import com.azure.ai.metricsadvisor.administration.models.SeverityCondition;
import com.azure.ai.metricsadvisor.administration.models.TopNGroupScope;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The MetricAlertingConfiguration model. */
@Fluent
public final class MetricAlertingConfiguration {
    /*
     * Anomaly detection configuration unique id
     */
    @JsonProperty(value = "anomalyDetectionConfigurationId", required = true)
    private UUID anomalyDetectionConfigurationId;

    /*
     * Anomaly scope
     */
    @JsonProperty(value = "anomalyScopeType", required = true)
    private AnomalyScope anomalyScopeType;

    /*
     * Negation operation
     */
    @JsonProperty(value = "negationOperation")
    private Boolean negationOperation;

    /*
     * The dimensionAnomalyScope property.
     */
    @JsonProperty(value = "dimensionAnomalyScope")
    private DimensionGroupIdentity dimensionAnomalyScope;

    /*
     * The topNAnomalyScope property.
     */
    @JsonProperty(value = "topNAnomalyScope")
    private TopNGroupScope topNAnomalyScope;

    /*
     * The severityFilter property.
     */
    @JsonProperty(value = "severityFilter")
    private SeverityCondition severityFilter;

    /*
     * The snoozeFilter property.
     */
    @JsonProperty(value = "snoozeFilter")
    private MetricAnomalyAlertSnoozeCondition snoozeFilter;

    /*
     * The valueFilter property.
     */
    @JsonProperty(value = "valueFilter")
    private ValueCondition valueFilter;

    /**
     * Get the anomalyDetectionConfigurationId property: Anomaly detection configuration unique id.
     *
     * @return the anomalyDetectionConfigurationId value.
     */
    public UUID getAnomalyDetectionConfigurationId() {
        return this.anomalyDetectionConfigurationId;
    }

    /**
     * Set the anomalyDetectionConfigurationId property: Anomaly detection configuration unique id.
     *
     * @param anomalyDetectionConfigurationId the anomalyDetectionConfigurationId value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setAnomalyDetectionConfigurationId(UUID anomalyDetectionConfigurationId) {
        this.anomalyDetectionConfigurationId = anomalyDetectionConfigurationId;
        return this;
    }

    /**
     * Get the anomalyScopeType property: Anomaly scope.
     *
     * @return the anomalyScopeType value.
     */
    public AnomalyScope getAnomalyScopeType() {
        return this.anomalyScopeType;
    }

    /**
     * Set the anomalyScopeType property: Anomaly scope.
     *
     * @param anomalyScopeType the anomalyScopeType value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setAnomalyScopeType(AnomalyScope anomalyScopeType) {
        this.anomalyScopeType = anomalyScopeType;
        return this;
    }

    /**
     * Get the negationOperation property: Negation operation.
     *
     * @return the negationOperation value.
     */
    public Boolean isNegationOperation() {
        return this.negationOperation;
    }

    /**
     * Set the negationOperation property: Negation operation.
     *
     * @param negationOperation the negationOperation value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setNegationOperation(Boolean negationOperation) {
        this.negationOperation = negationOperation;
        return this;
    }

    /**
     * Get the dimensionAnomalyScope property: The dimensionAnomalyScope property.
     *
     * @return the dimensionAnomalyScope value.
     */
    public DimensionGroupIdentity getDimensionAnomalyScope() {
        return this.dimensionAnomalyScope;
    }

    /**
     * Set the dimensionAnomalyScope property: The dimensionAnomalyScope property.
     *
     * @param dimensionAnomalyScope the dimensionAnomalyScope value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setDimensionAnomalyScope(DimensionGroupIdentity dimensionAnomalyScope) {
        this.dimensionAnomalyScope = dimensionAnomalyScope;
        return this;
    }

    /**
     * Get the topNAnomalyScope property: The topNAnomalyScope property.
     *
     * @return the topNAnomalyScope value.
     */
    public TopNGroupScope getTopNAnomalyScope() {
        return this.topNAnomalyScope;
    }

    /**
     * Set the topNAnomalyScope property: The topNAnomalyScope property.
     *
     * @param topNAnomalyScope the topNAnomalyScope value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setTopNAnomalyScope(TopNGroupScope topNAnomalyScope) {
        this.topNAnomalyScope = topNAnomalyScope;
        return this;
    }

    /**
     * Get the severityFilter property: The severityFilter property.
     *
     * @return the severityFilter value.
     */
    public SeverityCondition getSeverityFilter() {
        return this.severityFilter;
    }

    /**
     * Set the severityFilter property: The severityFilter property.
     *
     * @param severityFilter the severityFilter value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setSeverityFilter(SeverityCondition severityFilter) {
        this.severityFilter = severityFilter;
        return this;
    }

    /**
     * Get the snoozeFilter property: The snoozeFilter property.
     *
     * @return the snoozeFilter value.
     */
    public MetricAnomalyAlertSnoozeCondition getSnoozeFilter() {
        return this.snoozeFilter;
    }

    /**
     * Set the snoozeFilter property: The snoozeFilter property.
     *
     * @param snoozeFilter the snoozeFilter value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setSnoozeFilter(MetricAnomalyAlertSnoozeCondition snoozeFilter) {
        this.snoozeFilter = snoozeFilter;
        return this;
    }

    /**
     * Get the valueFilter property: The valueFilter property.
     *
     * @return the valueFilter value.
     */
    public ValueCondition getValueFilter() {
        return this.valueFilter;
    }

    /**
     * Set the valueFilter property: The valueFilter property.
     *
     * @param valueFilter the valueFilter value to set.
     * @return the MetricAlertingConfiguration object itself.
     */
    public MetricAlertingConfiguration setValueFilter(ValueCondition valueFilter) {
        this.valueFilter = valueFilter;
        return this;
    }
}
