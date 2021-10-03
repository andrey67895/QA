package reqresIn;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.ApiHelper.post;
import static helpers.AssertHelper.assertStatus;
import static java.net.HttpURLConnection.HTTP_CREATED;

public class UsersCreateTest {
    private final String HOST = "reqres.in/";
    private final String BASE_URL = "https://" + HOST;
    private final String PATH_USERS = "/api/users";

    @BeforeClass
    private void getBaseUrl() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void postUsersCreate() {
        UsersCreateJson usersCreateJson = UsersCreateJsonFactory.getUsersCreateJson();
        Response response = post(PATH_USERS,usersCreateJson);
        assertStatus(response, HTTP_CREATED);
        UsersCreateJson usersCreateJsonResponse = response.as(UsersCreateJson.class);
        Assert.assertEquals(usersCreateJsonResponse.getJob(), usersCreateJson.getJob());
        Assert.assertEquals(usersCreateJsonResponse.getName(), usersCreateJson.getName());
    }
}
