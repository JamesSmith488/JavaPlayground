package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {

    private Dog korone = new Dog();
    private Dog danny = new Dog();
    private Fox fubuki = new Fox();
    private Fox polka = new Fox();
    private List<Animal> animals = new ArrayList<>();
    private List<Fox> foxes = new ArrayList<>();

    public AnimalSanctuary(){
        animals.add(this.korone);
        animals.add(this.danny);
        animals.add(this.fubuki);
        animals.add(this.polka);

        foxes.add(this.fubuki);
        foxes.add(this.polka);
    }

    private List<Animal> animalsInSanctuary(){
        return animals;
    }

    private List<Fox> foxesInSanctuary(){
        return foxes;
    }

}
