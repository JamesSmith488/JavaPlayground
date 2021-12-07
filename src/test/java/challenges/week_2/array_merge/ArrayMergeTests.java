package challenges.week_2.array_merge;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayMergeTests {

    private int[] arr1 = new int[]{4, 5, 6};
    private int[] arr2 = new int[]{1, 2, 3};

    @Test
    public void arrayMergeTest(){
        assertArrayEquals(new int[]{4, 5, 6, 1, 2, 3}, ArrayMerge.arrayMerger(arr1, arr2));
    }

    @Test
    public void arrayMergeAscTest(){
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ArrayMerge.arrayMergerAsc(arr1, arr2));
    }

    @Test
    public void arrayMergeAscTest2(){
        int[] mergedArray = ArrayMerge.arrayMerger(arr1, arr2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, ArrayMerge.arrayMergerAsc(mergedArray));
    }

    @Test
    public void arrayMergeDescTest(){
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayMerge.arrayMergerDesc(arr1, arr2));
    }

    @Test
    public void arrayMergeDescTest2(){
        int[] mergedArray = ArrayMerge.arrayMerger(arr1, arr2);
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayMerge.arrayMergerDesc(mergedArray));
    }

    /*
    @Test
    public void arrayMergeDupesTest(){
        arr2 = new int[]{1, 2, 4};
        assertArrayEquals(new int[]{4, 5, 6, 1, 2}, ArrayMerge.arrayMergerDupes(arr1,arr2));
    }
     */

}
