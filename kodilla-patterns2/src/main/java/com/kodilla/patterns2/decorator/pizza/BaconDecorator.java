package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaOrderDecorator{
    public BaconDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getFullDescription(){
        return super.getFullDescription() + " + 1 bacon portion";
    }
}
