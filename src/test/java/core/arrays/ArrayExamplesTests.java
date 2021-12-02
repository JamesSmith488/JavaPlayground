package core.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayExamplesTests {

    ArrayExamples arrayExamples = new ArrayExamples();

    @Test
    public void getMenuItemsValueTest(){
        assertEquals(1,arrayExamples.getMenuItemsValue(0));
    }

    @Test
    public void setArrayExamplesTest(){
        arrayExamples.setMenuItemsValue(0,2);
        assertEquals(2,arrayExamples.getMenuItemsValue(0));
    }

    @Test
    public void setArrayExamplesInvalidRangeTest(){
        arrayExamples.setMenuItemsValue(0,12);
        assertEquals(1,arrayExamples.getMenuItemsValue(0));
    }

    @Test
    public void swapMenuItemsTest(){
        arrayExamples.swapMenuItems(0,1);
        assertEquals(2,arrayExamples.getMenuItemsValue(0));
        assertEquals(1,arrayExamples.getMenuItemsValue(1));
    }

    @Test
    public void rangeTest(){
        for (int i = 0; i < arrayExamples.size(); i++) {
            assertEquals(true,arrayExamples.getMenuItemsValue(i)>0);
            assertEquals(true,arrayExamples.getMenuItemsValue(i)<6);
        }
    }

}
