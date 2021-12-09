package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsTests {

    private ArrayList<Integer> arr;

    @BeforeEach
    void setup(){
        arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,10})
    @DisplayName("Which values throws an out of bounds exception")
    public void checkForOutOfBoundsExceptionTest(int index){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> arr.get(index));

    }

}
