// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodystring.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import fixtures.bodystring.AutoRestSwaggerBATServiceBuilder;
import fixtures.bodystring.EnumClient;

public class EnumGetReferenced {
    public static void main(String[] args) {
        EnumClient client = new AutoRestSwaggerBATServiceBuilder().host("http://localhost:3000").buildEnumClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<String> response = client.getReferencedWithResponse(requestOptions, Context.NONE);
    }
}