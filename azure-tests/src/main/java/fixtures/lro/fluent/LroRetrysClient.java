// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.lro.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import fixtures.lro.fluent.models.ProductInner;

/** An instance of this class provides access to all the operations defined in LroRetrysClient. */
public interface LroRetrysClient {
    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginPut201CreatingSucceeded200(ProductInner product);

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginPut201CreatingSucceeded200(
        ProductInner product, Context context);

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner put201CreatingSucceeded200(ProductInner product);

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner put201CreatingSucceeded200();

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner put201CreatingSucceeded200(ProductInner product, Context context);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginPutAsyncRelativeRetrySucceeded(ProductInner product);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginPutAsyncRelativeRetrySucceeded(
        ProductInner product, Context context);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner putAsyncRelativeRetrySucceeded(ProductInner product);

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner putAsyncRelativeRetrySucceeded();

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner putAsyncRelativeRetrySucceeded(ProductInner product, Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginDeleteProvisioning202Accepted200Succeeded();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ProductInner>, ProductInner> beginDeleteProvisioning202Accepted200Succeeded(Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner deleteProvisioning202Accepted200Succeeded();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request, with an entity that
     * contains ProvisioningState=’Accepted’. Polls return this value until the last poll returns a ‘200’ with
     * ProvisioningState=’Succeeded’.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ProductInner deleteProvisioning202Accepted200Succeeded(Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete202Retry200();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete202Retry200(Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete202Retry200();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value
     * until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete202Retry200(Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteAsyncRelativeRetrySucceeded();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeleteAsyncRelativeRetrySucceeded(Context context);

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAsyncRelativeRetrySucceeded();

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint
     * indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAsyncRelativeRetrySucceeded(Context context);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPost202Retry200(ProductInner product);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPost202Retry200(ProductInner product, Context context);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post202Retry200(ProductInner product);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post202Retry200();

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and
     * 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post202Retry200(ProductInner product, Context context);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPostAsyncRelativeRetrySucceeded(ProductInner product);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginPostAsyncRelativeRetrySucceeded(ProductInner product, Context context);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void postAsyncRelativeRetrySucceeded(ProductInner product);

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void postAsyncRelativeRetrySucceeded();

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains
     * ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation
     * status.
     *
     * @param product Product to put.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void postAsyncRelativeRetrySucceeded(ProductInner product, Context context);
}
