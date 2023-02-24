package randomUser;

import io.restassured.RestAssured;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class RandomUserApiTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://randomuser.me";
    }

//    @Test
//    public void generateUserWithoutParamTest(){
//        User user = RandomUserApi.sendUri("")
//                .body().as(User.class);
//        MatcherAssert.assertThat(user.getResults().get(0).getNat(), notNullValue());
//    }
    @Test
    public void generateUserGenderFemailTest(){
            User user = RandomUserApi.sendUri("gender","female")
                    .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getGender(), equalTo("female"));
    }
    @Test
    public void generateUserNatDKTest(){
        User user = RandomUserApi.sendUri("nat","DK")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("DK"));
    }
    @Test
    public void generateTwoUserTest(){
        User user = RandomUserApi.sendUri("nat","DK", "results","2")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("DK"));
        MatcherAssert.assertThat(user.getResults().get(1).getNat(), equalTo("DK"));
    }
//    @Test
//    public void generateNotAllParamTest(){
//        User user = RandomUserApi.sendUri("?inc=gender,name")
//                .body().as(User.class);
//        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo(null));
//
//    }



}
