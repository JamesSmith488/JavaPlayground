package functional;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        /* Anonymous inner class
        Doable myDoable = new Doable() {
            @Override
            public void doSomething(String word) {
                System.out.println("this does something");
            }
        }; */

        //Lambda expression
        Doable myDoable = word -> System.out.println("souts " + word);
        myDoable.doSomething("help");

        //Object converted to Stream
        //Manipulate Stream - Intermediate operation
        //Convert back to Object - Terminator operation
        ArrayList<String> beatles = new ArrayList<>(Arrays.asList("John","Paul","George","Ringo"));
        beatles.stream()
                .filter(x -> x.contains("o"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(containsAlphabet(sentence));
    }

    private static boolean containsAlphabet(String sentence){
        return sentence.toLowerCase()
                .chars()
                .filter(letter -> letter >= 'a' && letter <= 'z')
                .distinct()
                .count() == 26;
    }

}
