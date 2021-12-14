package challenges.week_3;

import java.util.Arrays;

public class GenericSorter {

    public static <T extends Number> T[] genericNumberSort(T[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] ints = {4,1,3,2,5};
        Double[] doubles = {1.87,7.4,2.5,6.9,-48.8};

        System.out.println(Arrays.toString(genericNumberSort(ints)));
        System.out.println(Arrays.toString(genericNumberSort(doubles)));
    }

}
