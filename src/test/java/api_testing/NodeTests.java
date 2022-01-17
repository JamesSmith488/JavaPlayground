package api_testing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class NodeTests {

    private static JsonNode node;

    @BeforeAll
    static void initAll() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            //node instead of pojo, have to traverse tree to get data
            node = mapper.readTree(new File("src/test/resources/rates.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void doTest() {
        System.out.println(node.get("success").asBoolean());
    }

}