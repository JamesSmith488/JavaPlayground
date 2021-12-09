package junit;

import org.junit.jupiter.api.*;
import java.time.LocalDate;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTests {

    private Spartan spartan, spartan2;

    @BeforeEach
    public void setup(){
        spartan = new Spartan(1,"James Smith", "Java", LocalDate.of(2021,11,29));
        spartan2 = new Spartan(1,"", "Java", LocalDate.of(2021,11,29));
    }

    @Nested
    @DisplayName("Hamcrest Spartan test")
    class HamcrestSpartanTest {

        @Test
        @DisplayName("Spartan is called James Smith")
        public void spartanNameTest(){
            assertThat(spartan.getName(), equalTo("James Smith"));
        }

        @Test
        @DisplayName("Hamcrest Spartan has a field called name")
        public void hamcrestSpartanHasAFieldCalledName(){
            assertThat(spartan, hasProperty("name"));
        }

        @Test
        @DisplayName("Hamcrest Spartan has a field called course and it is set to Java")
        public void hamcrestSpartanHasFieldCourseAndItsSetToJava(){
            assertThat(spartan, hasProperty("course", equalTo("Java")));
        }

    }

    @Nested
    @DisplayName("Hamcrest String methods")
    class HamcrestStringMethods {

        @Test
        @DisplayName("Hamcrest check a String is null or empty")
        public void hamcrestCheckStringIsNullOrEmpty(){
            assertThat(spartan2.getName(), isEmptyOrNullString());
        }

        @Test
        @DisplayName("Hamcrest check that name ends with th")
        public void hamcrestCheckNameEndsWithTh(){
            assertThat(spartan.getName(),endsWith("th"));
        }

    }

}
