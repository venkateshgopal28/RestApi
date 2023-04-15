import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LearnApi {

    @Test
    public void Verifystatuscode()
    {
        given().baseUri("https://reqres.in").when().get("/api/users/8").then().assertThat().statusCode(200);
    }

    @Test
    public void Verifyresponse()
    {
        given().baseUri("https://reqres.in").when().get("/api/users/8").then().assertThat().statusCode(200).body("data.first_name",equalTo("Lindsay"));
        given().baseUri("https://reqres.in").when().get("/api/users/8").then().assertThat().statusCode(200).body("data.last_name",equalTo("Ferguson"));
        given().baseUri("https://reqres.in").when().get("/api/users/8").then().assertThat().statusCode(200).body("data.avatar",equalTo("https://reqres.in/img/faces/8-image.jpg"));
    }

    @Test
    public void ContentType()
    {
        given().baseUri("https://reqres.in").when().get("/api/users/8").then().assertThat().statusCode(200).contentType("application/json; charset=utf-8");

    }
}
