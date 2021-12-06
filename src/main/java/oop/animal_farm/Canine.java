package oop.animal_farm;

public interface Canine {

    int legs = 4;
    String diet = "Carnivore";

    String hunt();
    String run(String speed);

    default String wagTail(){
        return "Wag";
    }

}
