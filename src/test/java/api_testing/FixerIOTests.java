package api_testing;

import api_testing.pojos.FixerIOPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class FixerIOTests {

    private FixerIOPojo fixerIOPojo;
    private final HttpClient client = HttpClient.newHttpClient();
    private final HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.fixer.io/"))
            .build();
    private HttpResponse<String> response = null;

    @BeforeEach
    void init() {
        ObjectMapper mapper = new ObjectMapper();
        fixerIOPojo= new FixerIOPojo();
        try {
            fixerIOPojo = mapper.readValue(new File("src/test/resources/rates.json"), FixerIOPojo.class);
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Check that success is not null test")
    void checkThatSuccessIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.isSuccess().getClass());
    }

    @Test
    @DisplayName("Check that success is true test")
    void checkThatSuccessIsTrueTest() {
        Assertions.assertEquals(true, fixerIOPojo.isSuccess());
    }

    @Test
    @DisplayName("Check that date is not null test")
    void checkThatDateIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.getDate().getClass());
    }

    @Test
    @DisplayName("Check that the date is a string of numbers test")
    void checkThatTheDateIsAStringOfNumbersTest() {
        Assertions.assertEquals(fixerIOPojo.getDate().replaceAll("[^0-9]-[^0-9]-[^0-9]",""), fixerIOPojo.getDate());
    }

    @Test
    @DisplayName("Check that base is not null test")
    void checkThatBaseIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.getBase().getClass());
    }

    @Test
    @DisplayName("Check that the base is EUR test")
    void checkThatTheBaseIsEurTest() {
        Assertions.assertEquals("EUR", fixerIOPojo.getBase());
    }

    @Test
    @DisplayName("Check that the base is full caps test")
    void checkThatTheBaseIsFullCapsTest() {
        Assertions.assertEquals(fixerIOPojo.getBase().toUpperCase(),fixerIOPojo.getBase());
    }

    @Test
    @DisplayName("Check that timestamp is not null test")
    void checkThatTimestampIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.getTimestamp().getClass());
    }

    @Test
    @DisplayName("Check that the timestamp is not null test")
    void checkThatTheTimestampIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.getTimestamp().getClass());
    }

    @Test
    @DisplayName("Check that rate is not null test")
    void checkThatRateIsNotNullTest() {
        Assertions.assertNotNull(fixerIOPojo.getRates().getClass());
    }

    @Test
    @DisplayName("Check that base's rate is 1 test")
    void checkThatBaseSRateIs1Test() {
        Assertions.assertEquals(1, fixerIOPojo.getRates().getEUR());
    }

    //168 currencies
    @Test
    @DisplayName("Check that all rates are there test")
    void checkThatAllRatesAreThereTest() {
        Assertions.assertEquals(168, fixerIOPojo.getRates().toString().split(",").length);
    }

    @Test
    @DisplayName("Check that the status code is 200 test")
    void checkThatTheStatusCodeIs200Test() {
        HttpHeaders headers = response.headers();
        Map<String, List<String>> map = headers.map();
        Assertions.assertEquals("200", map.get(":status").get(0));
    }

    /*
    Don't do this
    public static Stream<Method> getRatesGetters() {
        return Arrays.stream(Rates.class.getDeclaredMethods());
    }

    @ParameterizedTest
    @MethodSource("getRatesGetters")
    @DisplayName("All rates exist test")
    void allRatesExistsTest() {
        Assertions.assertNotNull(fixerIOPojo.getRates());
    }
    */
}