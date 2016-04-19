package com.microsoft.azure.management.resources.models.implementation;

import com.microsoft.azure.management.resources.ResourceGroups;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.IndexableRefreshableWrapperImpl;
import com.microsoft.azure.management.resources.implementation.api.DeploymentOperationsInner;
import com.microsoft.azure.management.resources.models.DeploymentOperation;
import com.microsoft.azure.management.resources.models.implementation.api.DeploymentOperationInner;
import com.microsoft.azure.management.resources.models.implementation.api.TargetResource;
import org.joda.time.DateTime;

public class DeploymentOperationImpl extends
        IndexableRefreshableWrapperImpl<DeploymentOperation, DeploymentOperationInner>
        implements
        DeploymentOperation {

    private final DeploymentOperationsInner deploymentOperations;
    private final ResourceGroups resourceGroups;
    private String resourceGroupName;
    private String deployementName;

    public DeploymentOperationImpl(DeploymentOperationInner deploymentOperation, DeploymentOperationsInner deploymentOperations, ResourceGroups resourceGroups) {
        super (deploymentOperation.id(), deploymentOperation);
        this.deploymentOperations = deploymentOperations;
        this.resourceGroupName = ResourceUtils.groupFromResourceId(deploymentOperation.id());
        this.deployementName = ResourceUtils.extractFromResourceId(deploymentOperation.id(), "deployments");
        this.resourceGroups = resourceGroups;
    }

    /***********************************************************
     * Getters
     ***********************************************************/

    @Override
    public String operationId() {
        return inner().operationId();
    }

    @Override
    public String provisioningState() {
        if (this.inner().properties() == null) {
            return null;
        }
        return this.inner().properties().provisioningState();
    }

    @Override
    public DateTime timestamp() {
        if (this.inner().properties() == null) {
            return null;
        }
        return this.inner().properties().timestamp();
    }

    @Override
    public String statusCode() {
        if (this.inner().properties() == null) {
            return null;
        }
        return this.inner().properties().statusCode();
    }

    @Override
    public Object statusMessage() {
        if (this.inner().properties() == null) {
            return null;
        }
        return this.inner().properties().statusMessage();
    }

    @Override
    public TargetResource targetResource() {
        if (this.inner().properties() == null) {
            return null;
        }
        return this.inner().properties().targetResource();
    }

    @Override
    public DeploymentOperation refresh() throws Exception {
        this.setInner(deploymentOperations.get(resourceGroupName, deployementName, operationId()).getBody());
        return this;
    }
}
