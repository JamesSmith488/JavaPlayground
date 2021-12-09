package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ParameterizedTests {

    @Nested
    @DisplayName("Nested Class - helps readability")
    class nestedTest {
        @ParameterizedTest(name = "[{index}] Testing for value = {arguments}")
        @ValueSource(ints = {2, 0, 10, 15, 13})
        @DisplayName("Using ints for a parameterized test")
        void doTest(int number) {
            Assertions.assertTrue(number < 10);
        }
    }

    @ParameterizedTest
    //@CsvSource({"Kieran","James"})
    @CsvFileSource(resources = "/names.csv")
    @DisplayName("Testing with literal csv values")
    public void anotherTest(String name){
        Assertions.assertEquals("James",name);
    }

    @ParameterizedTest
    @MethodSource("printingArrays")
    public void moreTest(int num, String name){
        Assertions.assertEquals(num,name.length());
    }

    public static Stream<Arguments> printingArrays() {
        return Stream.of(
                Arguments.arguments(6,"Kieran"),
                Arguments.arguments(5,"James")
        );
    }

}
