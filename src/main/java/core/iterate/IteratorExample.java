package core.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    private List<Integer> myList;

    public IteratorExample(List<Integer> myList){
        this.myList = myList;
    }

    public void addToArrayList_Errors(int num){
        for (int number : myList){
            myList.add(num);
        }
    }

    public void removeFromArrayListIterator(int num){
        Iterator<Integer> myListIterator = myList.iterator();
        while (myListIterator.hasNext()){
            Integer itrNum = myListIterator.next();
            System.out.println(itrNum);
            if (itrNum>num-1){
                myListIterator.remove();
            }
        }
        System.out.println(myList);
    }

    public static void main(String[] args) {
        IteratorExample iteratorExample = new IteratorExample(new ArrayList<>(Arrays.asList(1,2,3,4)));
        iteratorExample.removeFromArrayListIterator(4);
    }

}
