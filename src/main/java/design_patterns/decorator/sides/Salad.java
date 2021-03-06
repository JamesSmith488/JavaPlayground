package design_patterns.decorator.sides;

import design_patterns.decorator.pizzas.Pizza;

public class Salad extends Sides{

    public Salad(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and Salad";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 6;
    }

}
