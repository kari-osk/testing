import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class TestRestAssured {

    @Test
    public void api_test_01() {
        Response response = RestAssured.get("https://api.covid19api.com/countries");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
        validate.body(Matchers.containsString("Brazil"));
        validate.body(Matchers.containsString("BR"));
        validate.body(Matchers.containsString("Japan"));
        validate.body(Matchers.containsString("JP"));
        validate.time(Matchers.lessThanOrEqualTo(3500L));
        validate.contentType(ContentType.JSON);
    }

    @Test
    public void api_test_02() {
    Response response = RestAssured.get("https://api.covid19api.com/summary");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());

        ValidatableResponse validate = response.then();
        validate.statusCode(200);
        validate.body(Matchers.containsString("Country"));
        validate.body(Matchers.containsString("Albania"));
        validate.body(Matchers.containsString("TotalRecovered"));
        validate.time(Matchers.lessThanOrEqualTo(3500L));
        validate.contentType(ContentType.JSON);
    }

}
