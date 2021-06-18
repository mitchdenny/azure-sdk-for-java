// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VirtualNetworkPeeringInner;
import com.azure.resourcemanager.network.models.SyncRemoteAddressSpace;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualNetworkPeeringsClient. */
public interface VirtualNetworkPeeringsClient {
    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Deletes the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VirtualNetworkPeeringInner>> getWithResponseAsync(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkPeeringInner> getAsync(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkPeeringInner get(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName);

    /**
     * Gets the specified virtual network peering.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the virtual network peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualNetworkPeeringInner> getWithResponse(
        String resourceGroupName, String virtualNetworkName, String virtualNetworkPeeringName, Context context);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<VirtualNetworkPeeringInner>, VirtualNetworkPeeringInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkPeeringInner>, VirtualNetworkPeeringInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualNetworkPeeringInner>, VirtualNetworkPeeringInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace,
        Context context);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkPeeringInner> createOrUpdateAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VirtualNetworkPeeringInner> createOrUpdateAsync(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkPeeringInner createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkPeeringInner createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters);

    /**
     * Creates or updates a peering in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param virtualNetworkPeeringName The name of the peering.
     * @param virtualNetworkPeeringParameters Parameters supplied to the create or update virtual network peering
     *     operation.
     * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current address
     *     space on the remote vNet after it's updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peerings in a virtual network resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualNetworkPeeringInner createOrUpdate(
        String resourceGroupName,
        String virtualNetworkName,
        String virtualNetworkPeeringName,
        VirtualNetworkPeeringInner virtualNetworkPeeringParameters,
        SyncRemoteAddressSpace syncRemoteAddressSpace,
        Context context);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VirtualNetworkPeeringInner> listAsync(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkPeeringInner> list(String resourceGroupName, String virtualNetworkName);

    /**
     * Gets all virtual network peerings in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network peerings in a virtual network.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualNetworkPeeringInner> list(
        String resourceGroupName, String virtualNetworkName, Context context);
}
