package design_patterns.decorator.pizzas;

public class Chicago extends Pizza {

    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public Double getCost() {
        return 30.0;
    }

}
