/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.microsoft.rest.v2.Base64Url;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodystring.Strings;
import fixtures.bodystring.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public class StringsImpl implements Strings {
    /**
     * The proxy service used to perform REST calls.
     */
    private StringsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of StringsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public StringsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(StringsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Strings to be used by the
     * proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface StringsService {
        @GET("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getNull();

        @PUT("string/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putNull(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getEmpty();

        @PUT("string/empty")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putEmpty(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getMbcs();

        @PUT("string/mbcs")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMbcs(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getWhitespace();

        @PUT("string/whitespace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putWhitespace(@BodyParam("application/json; charset=utf-8") String stringBody);

        @GET("string/notProvided")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, String>> getNotProvided();

        @GET("string/base64Encoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getBase64Encoded();

        @GET("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getBase64UrlEncoded();

        @PUT("string/base64UrlEncoding")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putBase64UrlEncoded(@BodyParam("application/json; charset=utf-8") Base64Url stringBody);

        @GET("string/nullBase64UrlEncoding")
        @ExpectedResponses({200})
        @ReturnValueWireType(Base64Url.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, byte[]>> getNullBase64UrlEncoded();
    }

    /**
     * Get null string value value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;String&gt;} object.
     */
    public ServiceFuture<String> getNullAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null string value value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, String>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null string value value.
     *
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    public Maybe<String> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, String>, Maybe<String>>() {
                public Maybe<String> apply(RestResponse<Void, String> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Set string value null.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull() {
        putNullAsync().blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putNullAsync(ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putNullWithRestResponseAsync() {
        final String stringBody = null;
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @return the {@link Completable} object if successful.
     */
    public Completable putNullAsync() {
        return putNullWithRestResponseAsync()
            .toCompletable();
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putNull(String stringBody) {
        putNullAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putNullAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNullAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putNullWithRestResponseAsync(String stringBody) {
        return service.putNull(stringBody);
    }

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putNullAsync(String stringBody) {
        return putNullWithRestResponseAsync(stringBody)
            .toCompletable();
    }

    /**
     * Get empty string value value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getEmpty() {
        return getEmptyAsync().blockingGet();
    }

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;String&gt;} object.
     */
    public ServiceFuture<String> getEmptyAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(), serviceCallback);
    }

    /**
     * Get empty string value value ''.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, String>> getEmptyWithRestResponseAsync() {
        return service.getEmpty();
    }

    /**
     * Get empty string value value ''.
     *
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    public Maybe<String> getEmptyAsync() {
        return getEmptyWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, String>, Maybe<String>>() {
                public Maybe<String> apply(RestResponse<Void, String> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putEmpty(String stringBody) {
        putEmptyAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putEmptyAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putEmptyAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putEmpty(stringBody);
    }

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putEmptyAsync(String stringBody) {
        return putEmptyWithRestResponseAsync(stringBody)
            .toCompletable();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getMbcs() {
        return getMbcsAsync().blockingGet();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;String&gt;} object.
     */
    public ServiceFuture<String> getMbcsAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getMbcsAsync(), serviceCallback);
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, String>> getMbcsWithRestResponseAsync() {
        return service.getMbcs();
    }

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    public Maybe<String> getMbcsAsync() {
        return getMbcsWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, String>, Maybe<String>>() {
                public Maybe<String> apply(RestResponse<Void, String> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMbcs(String stringBody) {
        putMbcsAsync(stringBody).blockingAwait();
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putMbcsAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMbcsAsync(stringBody), serviceCallback);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putMbcsWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putMbcs(stringBody);
    }

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putMbcsAsync(String stringBody) {
        return putMbcsWithRestResponseAsync(stringBody)
            .toCompletable();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getWhitespace() {
        return getWhitespaceAsync().blockingGet();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;String&gt;} object.
     */
    public ServiceFuture<String> getWhitespaceAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getWhitespaceAsync(), serviceCallback);
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, String>> getWhitespaceWithRestResponseAsync() {
        return service.getWhitespace();
    }

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    public Maybe<String> getWhitespaceAsync() {
        return getWhitespaceWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, String>, Maybe<String>>() {
                public Maybe<String> apply(RestResponse<Void, String> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putWhitespace(String stringBody) {
        putWhitespaceAsync(stringBody).blockingAwait();
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putWhitespaceAsync(String stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putWhitespaceAsync(stringBody), serviceCallback);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putWhitespaceWithRestResponseAsync(String stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putWhitespace(stringBody);
    }

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putWhitespaceAsync(String stringBody) {
        return putWhitespaceWithRestResponseAsync(stringBody)
            .toCompletable();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the String object if successful.
     */
    public String getNotProvided() {
        return getNotProvidedAsync().blockingGet();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;String&gt;} object.
     */
    public ServiceFuture<String> getNotProvidedAsync(ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromBody(getNotProvidedAsync(), serviceCallback);
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, String>> getNotProvidedWithRestResponseAsync() {
        return service.getNotProvided();
    }

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    public Maybe<String> getNotProvidedAsync() {
        return getNotProvidedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, String>, Maybe<String>>() {
                public Maybe<String> apply(RestResponse<Void, String> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get value that is base64 encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64Encoded() {
        return getBase64EncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    public ServiceFuture<byte[]> getBase64EncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64EncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, byte[]>> getBase64EncodedWithRestResponseAsync() {
        return service.getBase64Encoded();
    }

    /**
     * Get value that is base64 encoded.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    public Maybe<byte[]> getBase64EncodedAsync() {
        return getBase64EncodedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, byte[]>, Maybe<byte[]>>() {
                public Maybe<byte[]> apply(RestResponse<Void, byte[]> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Get value that is base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getBase64UrlEncoded() {
        return getBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    public ServiceFuture<byte[]> getBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, byte[]>> getBase64UrlEncodedWithRestResponseAsync() {
        return service.getBase64UrlEncoded();
    }

    /**
     * Get value that is base64url encoded.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    public Maybe<byte[]> getBase64UrlEncodedAsync() {
        return getBase64UrlEncodedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, byte[]>, Maybe<byte[]>>() {
                public Maybe<byte[]> apply(RestResponse<Void, byte[]> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putBase64UrlEncoded(byte[] stringBody) {
        putBase64UrlEncodedAsync(stringBody).blockingAwait();
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> putBase64UrlEncodedAsync(byte[] stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putBase64UrlEncodedAsync(stringBody), serviceCallback);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> putBase64UrlEncodedWithRestResponseAsync(byte[] stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        Base64Url stringBodyConverted = Base64Url.encode(stringBody);
        return service.putBase64UrlEncoded(stringBodyConverted);
    }

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable putBase64UrlEncodedAsync(byte[] stringBody) {
        return putBase64UrlEncodedWithRestResponseAsync(stringBody)
            .toCompletable();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    public byte[] getNullBase64UrlEncoded() {
        return getNullBase64UrlEncodedAsync().blockingGet();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object.
     */
    public ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(ServiceCallback<byte[]> serviceCallback) {
        return ServiceFuture.fromBody(getNullBase64UrlEncodedAsync(), serviceCallback);
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, byte[]>> getNullBase64UrlEncodedWithRestResponseAsync() {
        return service.getNullBase64UrlEncoded();
    }

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    public Maybe<byte[]> getNullBase64UrlEncodedAsync() {
        return getNullBase64UrlEncodedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, byte[]>, Maybe<byte[]>>() {
                public Maybe<byte[]> apply(RestResponse<Void, byte[]> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
