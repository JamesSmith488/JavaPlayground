package api_testing.http;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class HttpTests {

    private HttpClient httpClient = HttpClient.newHttpClient();
    private HttpRequest httpRequest = HttpRequest.newBuilder()
            .uri(URI.create("https://api.chucknorris.io/jokes/random"))
            .build();
    private HttpResponse<String> httpResponse = null;

    @BeforeEach
    void init() {
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Check that the status code is 200 test")
    void checkThatTheStatusCodeIs200Test() {
        Assertions.assertEquals(200, httpResponse.statusCode());
    }

    @Test
    @DisplayName("Test name")
    void testName() {
        HttpHeaders httpHeaders = httpResponse.headers();
        Map<String,List<String>> map = httpHeaders.map();
        System.out.println(httpHeaders);
        System.out.println(map.get(":status").get(0));
    }

}