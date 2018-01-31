/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpServerFailures.
 */
public interface HttpServerFailures {
    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error head501();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> head501Async(ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> head501WithRestResponseAsync();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> head501Async();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error get501();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> get501Async(ServiceCallback<Error> serviceCallback);

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> get501WithRestResponseAsync();

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> get501Async();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error post505();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> post505Async(ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> post505WithRestResponseAsync();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> post505Async();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error post505(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> post505Async(Boolean booleanValue, ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> post505WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> post505Async(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error delete505();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> delete505Async(ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> delete505WithRestResponseAsync();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> delete505Async();

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    Error delete505(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    ServiceFuture<Error> delete505Async(Boolean booleanValue, ServiceCallback<Error> serviceCallback);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Error>> delete505WithRestResponseAsync(Boolean booleanValue);

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    Maybe<Error> delete505Async(Boolean booleanValue);
}
