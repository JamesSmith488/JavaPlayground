package api_testing;

import api_testing.pojos.ChuckNorrisPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.net.URL;

public class ChuckNorrisTests {

    private ObjectMapper mapper;
    private ChuckNorrisPojo chuckNorrisPojo;

    @BeforeEach
    void init() {
        mapper = new ObjectMapper();
        chuckNorrisPojo = new ChuckNorrisPojo();
    }

    @Test
    @DisplayName("Check that the icon URL contains https test")
    void checkThatTheIconUrlContainsHttpsTest() {
        try {
            chuckNorrisPojo = mapper.readValue(new URL("https://api.chucknorris.io/jokes/random"), ChuckNorrisPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(true,chuckNorrisPojo.getIconUrl().contains("https"));
    }

}