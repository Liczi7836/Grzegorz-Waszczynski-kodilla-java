package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PaprikaDecorator extends AbstractPizzaOrderDecorator{
    public PaprikaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(2));
    }

    @Override
    public String getFullDescription(){
        return super.getFullDescription() + " + 1 paprika portion";
    }
}
