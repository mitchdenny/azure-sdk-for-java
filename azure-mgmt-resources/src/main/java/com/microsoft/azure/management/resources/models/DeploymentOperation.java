package com.microsoft.azure.management.resources.models;

import com.microsoft.azure.management.resources.fluentcore.model.Indexable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;
import com.microsoft.azure.management.resources.models.implementation.api.DeploymentOperationInner;
import com.microsoft.azure.management.resources.models.implementation.api.TargetResource;
import org.joda.time.DateTime;

public interface DeploymentOperation extends
        Indexable,
        Refreshable<DeploymentOperation>,
        Wrapper<DeploymentOperationInner> {

    /***********************************************************
     * Getters
     ***********************************************************/

    String operationId();
    String provisioningState();
    DateTime timestamp();
    String statusCode();
    Object statusMessage();
    TargetResource targetResource();
}
