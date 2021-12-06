package oop.animal_farm;

public class Dog extends Animal implements Canine{

    public Dog() {
        super(4);
    }

    public Dog(int legs) {
        super(legs);
    }

    @Override
    public String eat() {
        return "Kibble";
    }

    @Override
    public String sound() {
        return "Woof";
    }


    @Override
    public String hunt() {
        return "I can hunt";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

}
