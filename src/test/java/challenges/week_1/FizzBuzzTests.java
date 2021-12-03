package challenges.week_1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    FizzBuzz fb = new FizzBuzz(100);
    FizzBuzz fb2 = new FizzBuzz(5);

    @Test
    public void getFizzBuzzValueTest(){
        assertEquals("Fizz",fb.getFizzBuzzValue(3));
        assertEquals("Buzz",fb.getFizzBuzzValue(5));
        assertEquals("FizzBuzz",fb.getFizzBuzzValue(15));
    }

    @Test
    public void getFizzBuzzTest(){
        assertArrayEquals(new String[]{"1", "2", "Fizz","4","Buzz"},fb2.getFizzBuzz());
    }

    @Test
    public void divisibleByTest(){
        assertEquals(true,fb.divisibleBy(9,3));
    }

}
