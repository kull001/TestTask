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
        RandomUserApi randomuserApi = new RandomUserApi();
    }

    @Test
    public void generateUserWithoutParamTest(){
        RandomUserApi randomuserApi = new RandomUserApi();
        User user = randomuserApi.sendUri("")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), notNullValue());
    }
    @Test
    public void generateUserGenderFemailTest(){
            RandomUserApi randomuserApi = new RandomUserApi();
            User user = randomuserApi.sendUri("?gender=female")
                    .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getGender(), equalTo("female"));
    }
    @Test
    public void generateUserNatDKTest(){
        RandomUserApi randomuserApi = new RandomUserApi();
        User user = randomuserApi.sendUri("?nat=DK")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("DK"));
    }
    @Test
    public void generateTwoUserTest(){
        RandomUserApi randomuserApi = new RandomUserApi();
        User user = randomuserApi.sendUri("?nat=DK&results=2")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo("DK"));
        MatcherAssert.assertThat(user.getResults().get(1).getNat(), equalTo("DK"));
    }
    @Test
    public void generateNotAllParamTest(){
        RandomUserApi randomuserApi = new RandomUserApi();
        User user = randomuserApi.sendUri("?inc=gender,name")
                .body().as(User.class);
        MatcherAssert.assertThat(user.getResults().get(0).getNat(), equalTo(null));

    }



}
