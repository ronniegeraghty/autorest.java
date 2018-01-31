/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodyfile.models.ErrorException;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * Files.
 */
public interface Files {
    /**
     * Get file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;byte[]&gt; object if successful.
     */
    Flowable<byte[]> getFile();

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;byte[]&gt;&gt;} object.
     */
    ServiceFuture<Flowable<byte[]>> getFileAsync(ServiceCallback<Flowable<byte[]>> serviceCallback);

    /**
     * Get file.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;byte[]&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Flowable<byte[]>>> getFileWithRestResponseAsync();

    /**
     * Get file.
     *
     * @return the {@link Maybe&lt;Flowable&lt;byte[]&gt;&gt;} object if successful.
     */
    Maybe<Flowable<byte[]>> getFileAsync();

    /**
     * Get a large file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;byte[]&gt; object if successful.
     */
    Flowable<byte[]> getFileLarge();

    /**
     * Get a large file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;byte[]&gt;&gt;} object.
     */
    ServiceFuture<Flowable<byte[]>> getFileLargeAsync(ServiceCallback<Flowable<byte[]>> serviceCallback);

    /**
     * Get a large file.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;byte[]&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Flowable<byte[]>>> getFileLargeWithRestResponseAsync();

    /**
     * Get a large file.
     *
     * @return the {@link Maybe&lt;Flowable&lt;byte[]&gt;&gt;} object if successful.
     */
    Maybe<Flowable<byte[]>> getFileLargeAsync();

    /**
     * Get empty file.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Flowable&lt;byte[]&gt; object if successful.
     */
    Flowable<byte[]> getEmptyFile();

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Flowable&lt;byte[]&gt;&gt;} object.
     */
    ServiceFuture<Flowable<byte[]>> getEmptyFileAsync(ServiceCallback<Flowable<byte[]>> serviceCallback);

    /**
     * Get empty file.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Flowable&lt;byte[]&gt;&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Flowable<byte[]>>> getEmptyFileWithRestResponseAsync();

    /**
     * Get empty file.
     *
     * @return the {@link Maybe&lt;Flowable&lt;byte[]&gt;&gt;} object if successful.
     */
    Maybe<Flowable<byte[]>> getEmptyFileAsync();
}
