package oop.animal_farm;

public class Fox extends Animal implements Canine{

    public Fox() {
        super(4);
    }

    public Fox(int legs) {
        super(legs);
    }

    @Override
    public String eat() {
        return "Carnivore";
    }

    @Override
    public String sound() {
        return "Yip";
    }

    @Override
    public String hunt() {
        return "I can hunt";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    public static void main(String[] args) {
        Fox fubuki = new Fox(4);
        System.out.println(fubuki.sleep());
    }

}
