package oop.animal_farm;

public abstract class Animal {

    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract String eat();

    public abstract String sound();

    public int getLegs(){
        return legs;
    }

    public String sleep(){
        return "I'm asleep";
    }

}
