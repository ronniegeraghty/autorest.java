/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodybyte;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodybyte.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Bytes.
 */
public interface Bytes {
    /**
     * Get null byte value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getNull();

    /**
     * Get null byte value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    ServiceFuture<byte[]> getNullAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get null byte value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getNullWithRestResponseAsync();

    /**
     * Get null byte value.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getNullAsync();

    /**
     * Get empty byte value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getEmpty();

    /**
     * Get empty byte value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    ServiceFuture<byte[]> getEmptyAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get empty byte value ''.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getEmptyWithRestResponseAsync();

    /**
     * Get empty byte value ''.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getEmptyAsync();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getNonAscii();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    ServiceFuture<byte[]> getNonAsciiAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getNonAsciiWithRestResponseAsync();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getNonAsciiAsync();

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putNonAscii(byte[] byteBody);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> putNonAsciiAsync(byte[] byteBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putNonAsciiWithRestResponseAsync(byte[] byteBody);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable putNonAsciiAsync(byte[] byteBody);

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    byte[] getInvalid();

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    ServiceFuture<byte[]> getInvalidAsync(ServiceCallback<byte[]> serviceCallback);

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getInvalidAsync();
}
