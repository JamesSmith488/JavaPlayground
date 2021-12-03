package core.maps;

import java.util.*;

public class HashMapExamples {

    private Map<Integer, String> exampleMap = new HashMap<>();

    public HashMapExamples() {
        exampleMap.put(1,"Bill");
        exampleMap.put(2,"Sarah");
        exampleMap.put(3,"Dave");
    }

    public HashMapExamples(Map<Integer, String> exampleMap) {
        exampleMap.put(1,"Bill");
        exampleMap.put(2,"Sarah");
        exampleMap.put(3,"Dave");
    }

    private String getName(int key){
        return exampleMap.get(key);
    }

    private Set<Integer> getKeys(){
        return exampleMap.keySet();
    }

    public Collection<String> getValues(){
        return exampleMap.values();
    }

    public void getEachEntry(){
        Set<Map.Entry<Integer,String>> entries = exampleMap.entrySet();
        for (Map.Entry<Integer,String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapExamples hashMapExamples = new HashMapExamples();
        System.out.println(hashMapExamples.getName(2));
        System.out.println(hashMapExamples.getKeys());
        System.out.println(hashMapExamples.getValues());
        hashMapExamples.getEachEntry();
    }

}
