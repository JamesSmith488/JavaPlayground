package nested_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Donatello", "Leonardo", "Michelangelo", "Raphael"));
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan("Manish", "Java"),
                new Spartan("Kieran", "Everything"),
                new Spartan("Richard", "Business")
        ));
        Collections.sort(names);
        Collections.sort(spartans, new Spartan.SpartanComparator());

        System.out.println(names);
        System.out.println(spartans);

        Collections.sort(spartans, new Comparator<Spartan>() {
            @Override
            public int compare(Spartan o1, Spartan o2) {
                return o1.getCourse().compareTo(o2.getCourse());
            }
        });

        System.out.println(spartans);
    }

}