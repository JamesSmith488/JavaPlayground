package core.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    private Set<String> mySet = new HashSet<>();

    public SetExamples(){
        mySet.add("one");
        mySet.add("two");
    }

    public void printSet(){
        for (String num : mySet){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        SetExamples setExamples = new SetExamples();
        setExamples.printSet();
    }

}
