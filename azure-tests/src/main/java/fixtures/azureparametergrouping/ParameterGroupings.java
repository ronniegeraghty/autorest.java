// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.azureparametergrouping;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import fixtures.azureparametergrouping.models.ErrorException;
import fixtures.azureparametergrouping.models.FirstParameterGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostMultiParamGroupsSecondParamGroup;
import fixtures.azureparametergrouping.models.ParameterGroupingPostOptionalParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostRequiredParameters;
import fixtures.azureparametergrouping.models.ParameterGroupingPostReservedWordsParameters;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ParameterGroupings. */
public final class ParameterGroupings {
    /** The proxy service used to perform REST calls. */
    private final ParameterGroupingsService service;

    /** The service client containing this operation class. */
    private final AutoRestParameterGroupingTestService client;

    /**
     * Initializes an instance of ParameterGroupings.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ParameterGroupings(AutoRestParameterGroupingTestService client) {
        this.service =
                RestProxy.create(
                        ParameterGroupingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestParameterGroupingTestServiceParameterGroupings to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AutoRestParameterGro")
    private interface ParameterGroupingsService {
        @Post("/parameterGrouping/postRequired/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> postRequired(
                @HostParam("$host") String host,
                @HeaderParam("customHeader") String customHeader,
                @QueryParam("query") Integer query,
                @PathParam("path") String path,
                @BodyParam("application/json") int body,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/parameterGrouping/postOptional")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> postOptional(
                @HostParam("$host") String host,
                @HeaderParam("customHeader") String customHeader,
                @QueryParam("query") Integer query,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/parameterGrouping/postReservedWords")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> postReservedWords(
                @HostParam("$host") String host,
                @QueryParam("from") String from,
                @QueryParam("accept") String accept,
                @HeaderParam("Accept") String acceptParam,
                Context context);

        @Post("/parameterGrouping/postMultipleParameterGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> postMultiParamGroups(
                @HostParam("$host") String host,
                @HeaderParam("header-one") String headerOne,
                @QueryParam("query-one") Integer queryOne,
                @HeaderParam("header-two") String headerTwo,
                @QueryParam("query-two") Integer queryTwo,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/parameterGrouping/sharedParameterGroupObject")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> postSharedParameterGroupObject(
                @HostParam("$host") String host,
                @HeaderParam("header-one") String headerOne,
                @QueryParam("query-one") Integer queryOne,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postRequiredWithResponseAsync(
            ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (parameterGroupingPostRequiredParameters == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter parameterGroupingPostRequiredParameters is required and cannot be null."));
        } else {
            parameterGroupingPostRequiredParameters.validate();
        }
        final String accept = "application/json";
        String customHeader = parameterGroupingPostRequiredParameters.getCustomHeader();
        Integer query = parameterGroupingPostRequiredParameters.getQuery();
        String path = parameterGroupingPostRequiredParameters.getPath();
        int body = parameterGroupingPostRequiredParameters.getBody();
        return FluxUtil.withContext(
                context ->
                        service.postRequired(this.client.getHost(), customHeader, query, path, body, accept, context));
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postRequiredAsync(
            ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) {
        return postRequiredWithResponseAsync(parameterGroupingPostRequiredParameters).flatMap(ignored -> Mono.empty());
    }

    /**
     * Post a bunch of required parameters grouped.
     *
     * @param parameterGroupingPostRequiredParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postRequired(ParameterGroupingPostRequiredParameters parameterGroupingPostRequiredParameters) {
        postRequiredAsync(parameterGroupingPostRequiredParameters).block();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postOptionalWithResponseAsync(
            ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (parameterGroupingPostOptionalParameters != null) {
            parameterGroupingPostOptionalParameters.validate();
        }
        final String accept = "application/json";
        String customHeaderInternal = null;
        if (parameterGroupingPostOptionalParameters != null) {
            customHeaderInternal = parameterGroupingPostOptionalParameters.getCustomHeader();
        }
        String customHeader = customHeaderInternal;
        Integer queryInternal = null;
        if (parameterGroupingPostOptionalParameters != null) {
            queryInternal = parameterGroupingPostOptionalParameters.getQuery();
        }
        Integer query = queryInternal;
        return FluxUtil.withContext(
                context -> service.postOptional(this.client.getHost(), customHeader, query, accept, context));
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postOptionalAsync(
            ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) {
        return postOptionalWithResponseAsync(parameterGroupingPostOptionalParameters).flatMap(ignored -> Mono.empty());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postOptionalAsync() {
        final ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters = null;
        return postOptionalWithResponseAsync(parameterGroupingPostOptionalParameters).flatMap(ignored -> Mono.empty());
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @param parameterGroupingPostOptionalParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postOptional(ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters) {
        postOptionalAsync(parameterGroupingPostOptionalParameters).block();
    }

    /**
     * Post a bunch of optional parameters grouped.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postOptional() {
        final ParameterGroupingPostOptionalParameters parameterGroupingPostOptionalParameters = null;
        postOptionalAsync(parameterGroupingPostOptionalParameters).block();
    }

    /**
     * Post a grouped parameters with reserved words.
     *
     * @param parameterGroupingPostReservedWordsParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postReservedWordsWithResponseAsync(
            ParameterGroupingPostReservedWordsParameters parameterGroupingPostReservedWordsParameters) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (parameterGroupingPostReservedWordsParameters != null) {
            parameterGroupingPostReservedWordsParameters.validate();
        }
        final String acceptParam = "application/json";
        String fromInternal = null;
        if (parameterGroupingPostReservedWordsParameters != null) {
            fromInternal = parameterGroupingPostReservedWordsParameters.getFrom();
        }
        String from = fromInternal;
        String acceptInternal = null;
        if (parameterGroupingPostReservedWordsParameters != null) {
            acceptInternal = parameterGroupingPostReservedWordsParameters.getAccept();
        }
        String accept = acceptInternal;
        return FluxUtil.withContext(
                context -> service.postReservedWords(this.client.getHost(), from, accept, acceptParam, context));
    }

    /**
     * Post a grouped parameters with reserved words.
     *
     * @param parameterGroupingPostReservedWordsParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postReservedWordsAsync(
            ParameterGroupingPostReservedWordsParameters parameterGroupingPostReservedWordsParameters) {
        return postReservedWordsWithResponseAsync(parameterGroupingPostReservedWordsParameters)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Post a grouped parameters with reserved words.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postReservedWordsAsync() {
        final ParameterGroupingPostReservedWordsParameters parameterGroupingPostReservedWordsParameters = null;
        return postReservedWordsWithResponseAsync(parameterGroupingPostReservedWordsParameters)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Post a grouped parameters with reserved words.
     *
     * @param parameterGroupingPostReservedWordsParameters Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postReservedWords(
            ParameterGroupingPostReservedWordsParameters parameterGroupingPostReservedWordsParameters) {
        postReservedWordsAsync(parameterGroupingPostReservedWordsParameters).block();
    }

    /**
     * Post a grouped parameters with reserved words.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postReservedWords() {
        final ParameterGroupingPostReservedWordsParameters parameterGroupingPostReservedWordsParameters = null;
        postReservedWordsAsync(parameterGroupingPostReservedWordsParameters).block();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Parameter group.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postMultiParamGroupsWithResponseAsync(
            FirstParameterGroup firstParameterGroup,
            ParameterGroupingPostMultiParamGroupsSecondParamGroup
                    parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (firstParameterGroup != null) {
            firstParameterGroup.validate();
        }
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            parameterGroupingPostMultiParamGroupsSecondParamGroup.validate();
        }
        final String accept = "application/json";
        String headerOneInternal = null;
        if (firstParameterGroup != null) {
            headerOneInternal = firstParameterGroup.getHeaderOne();
        }
        String headerOne = headerOneInternal;
        Integer queryOneInternal = null;
        if (firstParameterGroup != null) {
            queryOneInternal = firstParameterGroup.getQueryOne();
        }
        Integer queryOne = queryOneInternal;
        String headerTwoInternal = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            headerTwoInternal = parameterGroupingPostMultiParamGroupsSecondParamGroup.getHeaderTwo();
        }
        String headerTwo = headerTwoInternal;
        Integer queryTwoInternal = null;
        if (parameterGroupingPostMultiParamGroupsSecondParamGroup != null) {
            queryTwoInternal = parameterGroupingPostMultiParamGroupsSecondParamGroup.getQueryTwo();
        }
        Integer queryTwo = queryTwoInternal;
        return FluxUtil.withContext(
                context ->
                        service.postMultiParamGroups(
                                this.client.getHost(), headerOne, queryOne, headerTwo, queryTwo, accept, context));
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Parameter group.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postMultiParamGroupsAsync(
            FirstParameterGroup firstParameterGroup,
            ParameterGroupingPostMultiParamGroupsSecondParamGroup
                    parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        return postMultiParamGroupsWithResponseAsync(
                        firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postMultiParamGroupsAsync() {
        final FirstParameterGroup firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroup
                parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        return postMultiParamGroupsWithResponseAsync(
                        firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup)
                .flatMap(ignored -> Mono.empty());
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @param firstParameterGroup Parameter group.
     * @param parameterGroupingPostMultiParamGroupsSecondParamGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postMultiParamGroups(
            FirstParameterGroup firstParameterGroup,
            ParameterGroupingPostMultiParamGroupsSecondParamGroup
                    parameterGroupingPostMultiParamGroupsSecondParamGroup) {
        postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).block();
    }

    /**
     * Post parameters from multiple different parameter groups.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postMultiParamGroups() {
        final FirstParameterGroup firstParameterGroup = null;
        final ParameterGroupingPostMultiParamGroupsSecondParamGroup
                parameterGroupingPostMultiParamGroupsSecondParamGroup = null;
        postMultiParamGroupsAsync(firstParameterGroup, parameterGroupingPostMultiParamGroupsSecondParamGroup).block();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> postSharedParameterGroupObjectWithResponseAsync(
            FirstParameterGroup firstParameterGroup) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (firstParameterGroup != null) {
            firstParameterGroup.validate();
        }
        final String accept = "application/json";
        String headerOneInternal = null;
        if (firstParameterGroup != null) {
            headerOneInternal = firstParameterGroup.getHeaderOne();
        }
        String headerOne = headerOneInternal;
        Integer queryOneInternal = null;
        if (firstParameterGroup != null) {
            queryOneInternal = firstParameterGroup.getQueryOne();
        }
        Integer queryOne = queryOneInternal;
        return FluxUtil.withContext(
                context ->
                        service.postSharedParameterGroupObject(
                                this.client.getHost(), headerOne, queryOne, accept, context));
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postSharedParameterGroupObjectAsync(FirstParameterGroup firstParameterGroup) {
        return postSharedParameterGroupObjectWithResponseAsync(firstParameterGroup).flatMap(ignored -> Mono.empty());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> postSharedParameterGroupObjectAsync() {
        final FirstParameterGroup firstParameterGroup = null;
        return postSharedParameterGroupObjectWithResponseAsync(firstParameterGroup).flatMap(ignored -> Mono.empty());
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @param firstParameterGroup Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postSharedParameterGroupObject(FirstParameterGroup firstParameterGroup) {
        postSharedParameterGroupObjectAsync(firstParameterGroup).block();
    }

    /**
     * Post parameters with a shared parameter group object.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void postSharedParameterGroupObject() {
        final FirstParameterGroup firstParameterGroup = null;
        postSharedParameterGroupObjectAsync(firstParameterGroup).block();
    }
}
