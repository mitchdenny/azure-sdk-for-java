/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.peering.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PeerAsns.
 */
public class PeerAsnsInner {
    /** The Retrofit service to perform REST calls. */
    private PeerAsnsService service;
    /** The service client containing this operation class. */
    private PeeringManagementClientImpl client;

    /**
     * Initializes an instance of PeerAsnsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PeerAsnsInner(Retrofit retrofit, PeeringManagementClientImpl client) {
        this.service = retrofit.create(PeerAsnsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PeerAsns to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PeerAsnsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.PeerAsns get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}")
        Observable<Response<ResponseBody>> get(@Path("peerAsnName") String peerAsnName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.PeerAsns createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("peerAsnName") String peerAsnName, @Path("subscriptionId") String subscriptionId, @Body PeerAsnInner peerAsn, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.PeerAsns delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns/{peerAsnName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("peerAsnName") String peerAsnName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.PeerAsns list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Peering/peerAsns")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.peering.PeerAsns listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PeerAsnInner object if successful.
     */
    public PeerAsnInner get(String peerAsnName) {
        return getWithServiceResponseAsync(peerAsnName).toBlocking().single().body();
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PeerAsnInner> getAsync(String peerAsnName, final ServiceCallback<PeerAsnInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(peerAsnName), serviceCallback);
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerAsnInner object
     */
    public Observable<PeerAsnInner> getAsync(String peerAsnName) {
        return getWithServiceResponseAsync(peerAsnName).map(new Func1<ServiceResponse<PeerAsnInner>, PeerAsnInner>() {
            @Override
            public PeerAsnInner call(ServiceResponse<PeerAsnInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerAsnInner object
     */
    public Observable<ServiceResponse<PeerAsnInner>> getWithServiceResponseAsync(String peerAsnName) {
        if (peerAsnName == null) {
            throw new IllegalArgumentException("Parameter peerAsnName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(peerAsnName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PeerAsnInner>>>() {
                @Override
                public Observable<ServiceResponse<PeerAsnInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PeerAsnInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PeerAsnInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PeerAsnInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PeerAsnInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PeerAsnInner object if successful.
     */
    public PeerAsnInner createOrUpdate(String peerAsnName, PeerAsnInner peerAsn) {
        return createOrUpdateWithServiceResponseAsync(peerAsnName, peerAsn).toBlocking().single().body();
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PeerAsnInner> createOrUpdateAsync(String peerAsnName, PeerAsnInner peerAsn, final ServiceCallback<PeerAsnInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(peerAsnName, peerAsn), serviceCallback);
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerAsnInner object
     */
    public Observable<PeerAsnInner> createOrUpdateAsync(String peerAsnName, PeerAsnInner peerAsn) {
        return createOrUpdateWithServiceResponseAsync(peerAsnName, peerAsn).map(new Func1<ServiceResponse<PeerAsnInner>, PeerAsnInner>() {
            @Override
            public PeerAsnInner call(ServiceResponse<PeerAsnInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a new peer ASN or updates an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param peerAsn The peer ASN.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PeerAsnInner object
     */
    public Observable<ServiceResponse<PeerAsnInner>> createOrUpdateWithServiceResponseAsync(String peerAsnName, PeerAsnInner peerAsn) {
        if (peerAsnName == null) {
            throw new IllegalArgumentException("Parameter peerAsnName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (peerAsn == null) {
            throw new IllegalArgumentException("Parameter peerAsn is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(peerAsn);
        return service.createOrUpdate(peerAsnName, this.client.subscriptionId(), peerAsn, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PeerAsnInner>>>() {
                @Override
                public Observable<ServiceResponse<PeerAsnInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PeerAsnInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PeerAsnInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PeerAsnInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PeerAsnInner>() { }.getType())
                .register(201, new TypeToken<PeerAsnInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String peerAsnName) {
        deleteWithServiceResponseAsync(peerAsnName).toBlocking().single().body();
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String peerAsnName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(peerAsnName), serviceCallback);
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String peerAsnName) {
        return deleteWithServiceResponseAsync(peerAsnName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes an existing peer ASN with the specified name under the given subscription.
     *
     * @param peerAsnName The peer ASN name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String peerAsnName) {
        if (peerAsnName == null) {
            throw new IllegalArgumentException("Parameter peerAsnName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(peerAsnName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeerAsnInner&gt; object if successful.
     */
    public PagedList<PeerAsnInner> list() {
        ServiceResponse<Page<PeerAsnInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<PeerAsnInner>(response.body()) {
            @Override
            public Page<PeerAsnInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeerAsnInner>> listAsync(final ListOperationCallback<PeerAsnInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerAsnInner&gt; object
     */
    public Observable<Page<PeerAsnInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<PeerAsnInner>>, Page<PeerAsnInner>>() {
                @Override
                public Page<PeerAsnInner> call(ServiceResponse<Page<PeerAsnInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerAsnInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeerAsnInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<PeerAsnInner>>, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(ServiceResponse<Page<PeerAsnInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeerAsnInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeerAsnInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeerAsnInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeerAsnInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeerAsnInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeerAsnInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeerAsnInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;PeerAsnInner&gt; object if successful.
     */
    public PagedList<PeerAsnInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<PeerAsnInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<PeerAsnInner>(response.body()) {
            @Override
            public Page<PeerAsnInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<PeerAsnInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<PeerAsnInner>> serviceFuture, final ListOperationCallback<PeerAsnInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerAsnInner&gt; object
     */
    public Observable<Page<PeerAsnInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<PeerAsnInner>>, Page<PeerAsnInner>>() {
                @Override
                public Page<PeerAsnInner> call(ServiceResponse<Page<PeerAsnInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;PeerAsnInner&gt; object
     */
    public Observable<ServiceResponse<Page<PeerAsnInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<PeerAsnInner>>, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(ServiceResponse<Page<PeerAsnInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all of the peer ASNs under the given subscription.
     *
    ServiceResponse<PageImpl<PeerAsnInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;PeerAsnInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<PeerAsnInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<PeerAsnInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<PeerAsnInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<PeerAsnInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<PeerAsnInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<PeerAsnInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<PeerAsnInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<PeerAsnInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
