/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.DataMigrationService;
import rx.Observable;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.ServiceProvisioningState;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview.ServiceSku;

class DataMigrationServiceImpl extends GroupableResourceCoreImpl<DataMigrationService, DataMigrationServiceInner, DataMigrationServiceImpl, DataMigrationManager> implements DataMigrationService, DataMigrationService.Definition, DataMigrationService.Update {
    DataMigrationServiceImpl(String name, DataMigrationServiceInner inner, DataMigrationManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DataMigrationService> createResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DataMigrationService> updateResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DataMigrationServiceInner> getInnerAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public ServiceProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String publicKey() {
        return this.inner().publicKey();
    }

    @Override
    public ServiceSku sku() {
        return this.inner().sku();
    }

    @Override
    public String virtualSubnetId() {
        return this.inner().virtualSubnetId();
    }

    @Override
    public DataMigrationServiceImpl withVirtualSubnetId(String virtualSubnetId) {
        this.inner().withVirtualSubnetId(virtualSubnetId);
        return this;
    }

    @Override
    public DataMigrationServiceImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public DataMigrationServiceImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public DataMigrationServiceImpl withPublicKey(String publicKey) {
        this.inner().withPublicKey(publicKey);
        return this;
    }

    @Override
    public DataMigrationServiceImpl withSku(ServiceSku sku) {
        this.inner().withSku(sku);
        return this;
    }

}
