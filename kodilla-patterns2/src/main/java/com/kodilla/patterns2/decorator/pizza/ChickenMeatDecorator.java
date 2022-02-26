package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenMeatDecorator extends AbstractPizzaOrderDecorator {
    public ChickenMeatDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost(){
        return super.getPizzaCost().add(new BigDecimal(4));
    }

    @Override
    public String getFullDescription(){
        return super.getFullDescription() + " + 1 chicken meat portion";
    }
}
