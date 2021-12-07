package recursion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;

public class RecursionExamplesTests {

    @Test
    public void generateFibbonacci(){
        RecursionExamples recursionExamples = new RecursionExamples();
        ArrayList<Integer> seq = recursionExamples.generateFibbonacci(10);
        ArrayList<Integer> fib = new ArrayList<>();
        Collections.addAll(fib,0,1,1,2,3,5,8,13,21,34,55);
        assertEquals(fib,seq);
    }

}
