package challenges.week_2.bubble_sort;

import java.util.ArrayList;

public class BubbleSort {

    public static ArrayList<Integer> sort(ArrayList<Integer> list){
        ArrayList<Integer> sortedList = new ArrayList<>(list);
        int i = 1;
        int j;
        int element;
        while (i<sortedList.size()){
            j = i;
            while (j>0 && sortedList.get(j-1) > sortedList.get(j)){
                element = sortedList.get(j);
                sortedList.set(j,sortedList.get(j-1));
                sortedList.set(j-1,element);
                j--;
            }
            i++;
        }
        return sortedList;
    }

}
