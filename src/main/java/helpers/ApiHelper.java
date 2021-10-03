package helpers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.restassured.RestAssured.given;

public class ApiHelper {
   static final Logger logger = LogManager.getLogger(ApiHelper.class);

    public static Response get(String path) {
        Response response = given().log().all(true)
                .contentType(ContentType.JSON)
                .get(path);
        logResponse(response);
        return response;
    }

    public static Response post(String path, Object body) {
        Response response = given().log().all(true)
                .contentType(ContentType.JSON)
                .body(body)
                .post(path);
        logResponse(response);
        return response;
    }

    private static void logResponse(Response response) {
        logger.info("\nResponse code: " + response.getStatusCode());
        logger.info("\nResponse message: " + response.asString());
    }
}
