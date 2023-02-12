package cleanuri;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import java.io.File;
import static org.apache.http.HttpStatus.SC_OK;

public class CleanuriApiTest {
    File shortUrl = new File("src/main/resources/data.json");
    File longUrl = new File("src/main/resources/data1.json");
    File forbiddensSymbolUrl = new File("src/main/resources/data2.json");
    File emptyUrl = new File("src/main/resources/data3.json");

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://cleanuri.com";

    }
    @Test
    public void sendShortUrlTest(){
        CleanuriApi cleanuriApi = new CleanuriApi(shortUrl);
        cleanuriApi.sendUri()
                        .then().statusCode(SC_OK);
            }

    @Test
    public void sendLongUrlTest(){
        CleanuriApi cleanuriApi = new CleanuriApi(longUrl);
        cleanuriApi.sendUri()
                .then().statusCode(SC_OK);
    }
    @Test
    public void sendUrlWithForbiddenSymbolTest(){
        CleanuriApi cleanuriApi = new CleanuriApi(forbiddensSymbolUrl);
        cleanuriApi.sendUri()
                .then().assertThat().body("error", equalTo("API Error: URL is invalid (check #1)"));
    }
    @Test
    public void sendEmptyUrlTest(){
        CleanuriApi cleanuriApi = new CleanuriApi(emptyUrl);
        cleanuriApi.sendUri()
                .then().assertThat().body("error", equalTo("API Error: URL is empty"));
    }
}
