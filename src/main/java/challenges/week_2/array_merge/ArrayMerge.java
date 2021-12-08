package challenges.week_2.array_merge;

public class ArrayMerge {

    /*
    1. Given two arrays you must merge those arrays and return them
    2. Return the array in Ascending order
    3. Return the array in Descending order
    4. Remove duplicates (Utilising a collection to do this is acceptable)
     */

    public static int[] arrayMerger(int[] arr1, int[] arr2) {
        //Makes an array of ints with enough space to fit all elements of both inputted arrays
        int[] mergedArr = new int[arr1.length + arr2.length];
        //Loops through the first array adding its elements
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        //Loops through the second array adding its elements, offset by the length of the first array
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }
        return mergedArr;
    }

    public static int[] arrayMergerAsc(int[] arr1, int[] arr2){
        int[] mergedArr = arrayMerger(arr1,arr2);
        return arrayMergerAsc(mergedArr);
    }

    public static int[] arrayMergerAsc(int[] mergedArr){
        //Bubble sort ascending
        int i = 1;
        int j;
        int element;
        while (i < mergedArr.length){
            j = i;
            while (j > 0 && mergedArr[j-1] > mergedArr[j]){
                element = mergedArr[j];
                mergedArr[j] = mergedArr[j-1];
                mergedArr[j-1] = element;
                j--;
            }
            i++;
        }
        return mergedArr;
    }

    public static int[] arrayMergerDesc(int[] arr1, int[] arr2){
        int[] mergedArr = arrayMerger(arr1,arr2);
        return arrayMergerDesc(mergedArr);
    }

    public static int[] arrayMergerDesc(int[] mergedArr){
        //Bubble sort descending
        int i = 1;
        int j;
        int element;
        while (i < mergedArr.length){
            j = i;
            while (j > 0 && mergedArr[j-1] < mergedArr[j]){
                element = mergedArr[j];
                mergedArr[j] = mergedArr[j-1];
                mergedArr[j-1] = element;
                j--;
            }
            i++;
        }
        return mergedArr;
    }

    public static int[] arrayMergerDupes(int[] arr1, int[] arr2){
        int[] mergedArr = arrayMerger(arr1,arr2);
        return arrayMergerDupes(mergedArr);
    }

    public static int[] arrayMergerDupes(int[] mergedArr){
        int[] tempArr = new int[mergedArr.length];
        boolean contains;
        int length = 0;
        for (int i = 0; i < mergedArr.length; i++) {
            contains = false;
            for (int j = 0; j < tempArr.length; j++) {
                if (mergedArr[i] == tempArr[j]){
                    contains = true;
                    break;
                }
            }
            if (!contains){
                tempArr[i] = mergedArr[i];
                length++;
            }
        }
        int[] uniqueArr = new int[length];
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = tempArr[i];
        }
        return uniqueArr;
    }

}
