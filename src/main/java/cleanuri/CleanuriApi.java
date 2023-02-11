package cleanuri;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.File;

public class CleanuriApi {

    final static String CLEANURI_ULI = "/api/v1/shorten";
    public CleanuriApi (File file){
        this.json = file;
    }
    File json ;

    public Response sendUri(){
        return  given()
                .header("Content-type", "application/json")
                .and()
                .body(json)
                .when()
                .post(CLEANURI_ULI);
    }
}
