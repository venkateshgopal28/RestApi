import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LearnApi {

    @Test
    public void Test1()
    {
        given().baseUri("https://reqres.in").when().get("/api/users").then().assertThat().statusCode(200);

    }
}
