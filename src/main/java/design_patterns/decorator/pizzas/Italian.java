package design_patterns.decorator.pizzas;

public class Italian extends Pizza {

    @Override
    public String getDescription() {
        return "Italian Pizza";
    }

    @Override
    public Double getCost() {
        return 25.0;
    }

}
