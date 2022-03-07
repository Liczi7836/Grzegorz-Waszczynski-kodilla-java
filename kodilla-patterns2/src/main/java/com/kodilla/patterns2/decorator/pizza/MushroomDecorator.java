package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomDecorator extends AbstractPizzaOrderDecorator{
    public MushroomDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(3));
    }

    @Override
    public String getFullDescription(){
        return super.getFullDescription() + " + 1 mushroom portion";
    }
}
