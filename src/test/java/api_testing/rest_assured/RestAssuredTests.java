package api_testing.rest_assured;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

public class RestAssuredTests {

    private static Response response;

    @BeforeAll
    static void setupAll() {
        response = get("https://www.spartaglobal.com/");
    }

    @Test
    void doTest() {
        response
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    void doAnotherTest() {
        assert response
                .getHeader("X-Powered-By")
                .equals("ASP.NET");
    }

    @Test
    void doMoreTest() {
        System.out.println(response.timeIn(TimeUnit.MILLISECONDS));
    }

}