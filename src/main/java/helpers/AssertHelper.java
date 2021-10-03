package helpers;

import io.restassured.response.Response;
import org.testng.Assert;

public class AssertHelper {
    public static void assertStatus(Response response, int respCode) {
        int code = response.getStatusCode();
        Assert.assertEquals(code, respCode, response.asString() + " Response code is wrong");
    }
}
