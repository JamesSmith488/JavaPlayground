package api_testing;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {

    private static final String BASEURL = "https://www.dnd5eapi.co/api/";
    private static String endPoint;
    private static String URL;
    private static String type;

    public static String getConnection() {
        getResponse();
        return BASEURL;
    }

    public static String getConnection(String type, String index) {
        return BASEURL + type + "/" + index;
    }

    public static String getConnection(String type, String option, String value) {
        return BASEURL + type + "/?" + option + "=" + value;
    }

    public static int getStatusCode() {
        return getResponse().statusCode();
    }

    private static HttpResponse<String> getResponse() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(BASEURL + endPoint)).build();
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    public String getURL() {
        return BASEURL + endPoint;
    }

}