/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public interface Paths {
    /**
     * Get true Boolean value on path.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getBooleanTrue();

    /**
     * Get true Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getBooleanTrueAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get true Boolean value on path.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getBooleanTrueWithRestResponseAsync();

    /**
     * Get true Boolean value on path.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getBooleanTrueAsync();

    /**
     * Get false Boolean value on path.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getBooleanFalse();

    /**
     * Get false Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getBooleanFalseAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getBooleanFalseWithRestResponseAsync();

    /**
     * Get false Boolean value on path.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getBooleanFalseAsync();

    /**
     * Get '1000000' integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getIntOneMillion();

    /**
     * Get '1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getIntOneMillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getIntOneMillionWithRestResponseAsync();

    /**
     * Get '1000000' integer value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getIntOneMillionAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getIntNegativeOneMillion();

    /**
     * Get '-1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getIntNegativeOneMillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getIntNegativeOneMillionWithRestResponseAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getIntNegativeOneMillionAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getTenBillion();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getTenBillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getTenBillionWithRestResponseAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getTenBillionAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getNegativeTenBillion();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> getNegativeTenBillionAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> getNegativeTenBillionWithRestResponseAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable getNegativeTenBillionAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void floatScientificPositive();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> floatScientificPositiveAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> floatScientificPositiveWithRestResponseAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable floatScientificPositiveAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void floatScientificNegative();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> floatScientificNegativeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> floatScientificNegativeWithRestResponseAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable floatScientificNegativeAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void doubleDecimalPositive();

    /**
     * Get '9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> doubleDecimalPositiveAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> doubleDecimalPositiveWithRestResponseAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable doubleDecimalPositiveAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void doubleDecimalNegative();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> doubleDecimalNegativeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> doubleDecimalNegativeWithRestResponseAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable doubleDecimalNegativeAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringUnicode();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> stringUnicodeAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> stringUnicodeWithRestResponseAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable stringUnicodeAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringUrlEncoded();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> stringUrlEncodedAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> stringUrlEncodedWithRestResponseAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable stringUrlEncodedAsync();

    /**
     * Get ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringEmpty();

    /**
     * Get ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> stringEmptyAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get ''.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> stringEmptyWithRestResponseAsync();

    /**
     * Get ''.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable stringEmptyAsync();

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stringNull(String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> stringNullAsync(String stringPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> stringNullWithRestResponseAsync(String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable stringNullAsync(String stringPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enumValid(UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> enumValidAsync(UriColor enumPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> enumValidWithRestResponseAsync(UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable enumValidAsync(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void enumNull(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> enumNullAsync(UriColor enumPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> enumNullWithRestResponseAsync(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable enumNullAsync(UriColor enumPath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteMultiByte(byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> byteMultiByteAsync(byte[] bytePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> byteMultiByteWithRestResponseAsync(byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable byteMultiByteAsync(byte[] bytePath);

    /**
     * Get '' as byte array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteEmpty();

    /**
     * Get '' as byte array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> byteEmptyAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> byteEmptyWithRestResponseAsync();

    /**
     * Get '' as byte array.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable byteEmptyAsync();

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void byteNull(byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> byteNullAsync(byte[] bytePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> byteNullWithRestResponseAsync(byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable byteNullAsync(byte[] bytePath);

    /**
     * Get '2012-01-01' as date.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateValid();

    /**
     * Get '2012-01-01' as date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> dateValidAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> dateValidWithRestResponseAsync();

    /**
     * Get '2012-01-01' as date.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable dateValidAsync();

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateNull(LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> dateNullAsync(LocalDate datePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> dateNullWithRestResponseAsync(LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable dateNullAsync(LocalDate datePath);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateTimeValid();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> dateTimeValidAsync(ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> dateTimeValidWithRestResponseAsync();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return the {@link Completable} object if successful.
     */
    Completable dateTimeValidAsync();

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dateTimeNull(DateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> dateTimeNullAsync(DateTime dateTimePath, ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> dateTimeNullWithRestResponseAsync(DateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable dateTimeNullAsync(DateTime dateTimePath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void base64Url(byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> base64UrlAsync(byte[] base64UrlPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> base64UrlWithRestResponseAsync(byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable base64UrlAsync(byte[] base64UrlPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void arrayCsvInPath(List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> arrayCsvInPathAsync(List<String> arrayPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> arrayCsvInPathWithRestResponseAsync(List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable arrayCsvInPathAsync(List<String> arrayPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void unixTimeUrl(DateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    ServiceFuture<Void> unixTimeUrlAsync(DateTime unixTimeUrlPath, ServiceCallback<Void> serviceCallback);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> unixTimeUrlWithRestResponseAsync(DateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    Completable unixTimeUrlAsync(DateTime unixTimeUrlPath);
}
