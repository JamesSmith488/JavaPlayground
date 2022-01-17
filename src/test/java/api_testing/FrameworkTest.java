package api_testing;

import api_testing.dto.Spells;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class FrameworkTest {

    Spells spells;

    @BeforeEach
    void setup() {
        spells = Injector.injectDTO(ConnectionManager.getConnection("spells", "burning-hands"));
    }

    @Test
    @DisplayName("Status code is 200")
    void statusCodeIs200() {
        assertEquals(200, ConnectionManager.getStatusCode());
    }

    @Nested
    @DisplayName("Checking for value types")
    class CheckForValueTypesTests {
        @Test
        @DisplayName("Are there components test")
        void areThereComponentsTest() {
            assertTrue(spells.hasComponents());
        }

        @Test
        @DisplayName("Is there a level test")
        void isThereALevelTest() {
            assertTrue(spells.hasLevel());
        }
    }

    @Nested
    @DisplayName("Check that values are valid")
    class CheckThatValuesAreValidTests {

    }

}