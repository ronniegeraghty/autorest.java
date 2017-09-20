package fixtures.lro;

import com.microsoft.rest.RestClient;
import com.microsoft.rest.credentials.BasicAuthenticationCredentials;
import com.microsoft.rest.v2.http.HttpHeaders;
import com.microsoft.rest.v2.policy.AddHeadersPolicy;
import com.microsoft.rest.v2.policy.AddHeadersPolicy.Factory;
import fixtures.lro.implementation.AutoRestLongRunningOperationTestServiceImpl;
import fixtures.lro.models.Product;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class LROsCustomHeaderTests {
    private static AutoRestLongRunningOperationTestServiceImpl client;
    private static Map<String, String> customHeaders;

    @BeforeClass
    public static void setup() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-ms-client-request-id", "9C4D50EE-2D56-4CD3-8152-34347DC9F2B0");

        RestClient restClient = new RestClient.Builder()
                .withBaseUrl("http://localhost:3000")
                .withCredentials(new BasicAuthenticationCredentials(null, null))
                .addCustomPolicy(new AddHeadersPolicy.Factory(headers))
                .build();
        client = new AutoRestLongRunningOperationTestServiceImpl(restClient);
//        client.getAzureClient().setLongRunningOperationRetryTimeout(0);
    }

    @AfterClass
    public static void cleanup() {
//        client.restClient().headers().removeHeader("x-ms-client-request-id");
    }

    @Test
    public void putAsyncRetrySucceeded() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROsCustomHeaders().putAsyncRetrySucceeded(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void put201CreatingSucceeded200() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        Product response = client.lROsCustomHeaders().put201CreatingSucceeded200(product);
        Assert.assertEquals("Succeeded", response.provisioningState());
    }

    @Test
    public void post202Retry200() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        client.lROsCustomHeaders().post202Retry200(product);
    }

    @Test
    public void postAsyncRetrySucceeded() throws Exception {
        Product product = new Product();
        product.withLocation("West US");
        client.lROsCustomHeaders().postAsyncRetrySucceeded(product);
    }
}
