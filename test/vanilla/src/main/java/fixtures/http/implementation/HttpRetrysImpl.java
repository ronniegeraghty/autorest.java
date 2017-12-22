/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PATCH;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.http.HttpRetrys;
import fixtures.http.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpRetrys.
 */
public class HttpRetrysImpl implements HttpRetrys {
    /**
     * The RestProxy service to perform REST calls.
     */
    private HttpRetrysService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpRetrys.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpRetrysImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpRetrysService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpRetrys to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface HttpRetrysService {
        @HEAD("http/retry/408")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> head408();

        @PUT("http/retry/500")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> put500(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @PATCH("http/retry/500")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> patch500(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @GET("http/retry/502")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> get502();

        @POST("http/retry/503")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> post503(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @DELETE("http/retry/503")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> delete503(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @PUT("http/retry/504")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> put504(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @PATCH("http/retry/504")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> patch504(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void head408() {
        head408Async().blockingAwait();
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> head408Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(head408Async(), serviceCallback);
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> head408WithRestResponseAsync() {
        return service.head408();
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable head408Async() {
        return head408WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void put500() {
        put500Async().blockingAwait();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put500Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put500Async(), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> put500WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.put500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable put500Async() {
        return put500WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void put500(Boolean booleanValue) {
        put500Async(booleanValue).blockingAwait();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put500Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put500Async(booleanValue), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> put500WithRestResponseAsync(Boolean booleanValue) {
        return service.put500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable put500Async(Boolean booleanValue) {
        return put500WithRestResponseAsync(booleanValue)
            .toCompletable();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void patch500() {
        patch500Async().blockingAwait();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch500Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch500Async(), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> patch500WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.patch500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable patch500Async() {
        return patch500WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void patch500(Boolean booleanValue) {
        patch500Async(booleanValue).blockingAwait();
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch500Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch500Async(booleanValue), serviceCallback);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> patch500WithRestResponseAsync(Boolean booleanValue) {
        return service.patch500(booleanValue);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable patch500Async(Boolean booleanValue) {
        return patch500WithRestResponseAsync(booleanValue)
            .toCompletable();
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void get502() {
        get502Async().blockingAwait();
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> get502Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(get502Async(), serviceCallback);
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> get502WithRestResponseAsync() {
        return service.get502();
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable get502Async() {
        return get502WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void post503() {
        post503Async().blockingAwait();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> post503Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(post503Async(), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> post503WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.post503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable post503Async() {
        return post503WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void post503(Boolean booleanValue) {
        post503Async(booleanValue).blockingAwait();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> post503Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(post503Async(booleanValue), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> post503WithRestResponseAsync(Boolean booleanValue) {
        return service.post503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable post503Async(Boolean booleanValue) {
        return post503WithRestResponseAsync(booleanValue)
            .toCompletable();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void delete503() {
        delete503Async().blockingAwait();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> delete503Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(delete503Async(), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> delete503WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.delete503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable delete503Async() {
        return delete503WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void delete503(Boolean booleanValue) {
        delete503Async(booleanValue).blockingAwait();
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> delete503Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(delete503Async(booleanValue), serviceCallback);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> delete503WithRestResponseAsync(Boolean booleanValue) {
        return service.delete503(booleanValue);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable delete503Async(Boolean booleanValue) {
        return delete503WithRestResponseAsync(booleanValue)
            .toCompletable();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void put504() {
        put504Async().blockingAwait();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put504Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put504Async(), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> put504WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.put504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable put504Async() {
        return put504WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void put504(Boolean booleanValue) {
        put504Async(booleanValue).blockingAwait();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> put504Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(put504Async(booleanValue), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> put504WithRestResponseAsync(Boolean booleanValue) {
        return service.put504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable put504Async(Boolean booleanValue) {
        return put504WithRestResponseAsync(booleanValue)
            .toCompletable();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void patch504() {
        patch504Async().blockingAwait();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch504Async(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch504Async(), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> patch504WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.patch504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable patch504Async() {
        return patch504WithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void patch504(Boolean booleanValue) {
        patch504Async(booleanValue).blockingAwait();
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> patch504Async(Boolean booleanValue, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(patch504Async(booleanValue), serviceCallback);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> patch504WithRestResponseAsync(Boolean booleanValue) {
        return service.patch504(booleanValue);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable patch504Async(Boolean booleanValue) {
        return patch504WithRestResponseAsync(booleanValue)
            .toCompletable();
    }
}
