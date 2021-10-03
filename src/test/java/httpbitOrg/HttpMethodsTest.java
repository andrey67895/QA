package httpbitOrg;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.ApiHelper.get;
import static helpers.AssertHelper.assertStatus;
import static java.net.HttpURLConnection.HTTP_OK;

public class HttpMethodsTest {
    private final String HOST = "httpbin.org";
    private final String BASE_URL = "http://" + HOST;
    private final String PATH_GET = "/get";

    @BeforeClass
    private void getBaseUrl() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void getHttpMethods() {
        Response response = get(PATH_GET);
        assertStatus(response, HTTP_OK);
        GetHttpMethodsJson getHttpMethodsJson = response.as(GetHttpMethodsJson.class);
        Assert.assertEquals(getHttpMethodsJson.getHeaders().getHost(), HOST);
        Assert.assertEquals(getHttpMethodsJson.getUrl(), BASE_URL + PATH_GET);
    }
}

