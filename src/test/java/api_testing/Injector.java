package api_testing;

import api_testing.dto.Spells;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class Injector {

    public static Spells injectDTO(String URL) {
        Spells spells = new Spells();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            spells =  objectMapper.readValue(new URL(URL), Spells.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spells;
    }

}