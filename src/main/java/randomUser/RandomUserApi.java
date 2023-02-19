package randomUser;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public class RandomUserApi {
    final static String USERS_URI = "/api";
    public Response sendUri(String params){
        return  given()
                .header("Content-type", "application/json")
                .get(USERS_URI + params);
    }
}
