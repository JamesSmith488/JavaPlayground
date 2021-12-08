package design_patterns.decorator.sides;

import design_patterns.decorator.pizzas.Pizza;

public class Chips extends Sides{

    public Chips(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and Chips";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 5;
    }

}
