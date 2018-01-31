/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.parameterflattening;

import com.microsoft.rest.v2.RestException;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.Map;

/**
 * An instance of this class provides access to all the operations defined in
 * AvailabilitySets.
 */
public interface AvailabilitySets {
    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void update(String resourceGroupName, String avset, Map<String, String> tags);

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> updateAsync(String resourceGroupName, String avset, Map<String, String> tags, ServiceCallback<Void> serviceCallback);

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> updateWithRestResponseAsync(String resourceGroupName, String avset, Map<String, String> tags);

    /**
     * Updates the tags for an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param avset The name of the storage availability set.
     * @param tags A set of tags. A description about the set of tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable updateAsync(String resourceGroupName, String avset, Map<String, String> tags);
}
