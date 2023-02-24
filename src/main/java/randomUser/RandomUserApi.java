package randomUser;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
public  class RandomUserApi {
    final static String USERS_URI = "/api";
    public static Response sendUri(String name, String params) {
        return  given()
                .queryParam(name, params)
                .header("Content-type", "application/json")
                .get(USERS_URI);
    }

    public static Response sendUri(String name, String params, String name2, String params2) {
        return  given()
                .queryParam(name, params)
                .queryParam(name2, params2)
                .header("Content-type", "application/json")
                .get(USERS_URI);
    }
}
