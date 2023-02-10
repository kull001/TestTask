package cleanuri;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

public class CleanuriApiTest {

    CleanuriApi cleanuriApi = new CleanuriApi();

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://cleanuri.com";

    }
    @Test
    public void possibleCreateCourierTest(){
        cleanuriApi.sendUri()
                        .then().statusCode(SC_OK);



    }
}
