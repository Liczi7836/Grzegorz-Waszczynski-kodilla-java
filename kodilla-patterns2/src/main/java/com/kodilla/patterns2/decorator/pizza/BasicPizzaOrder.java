package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getPizzaCost(){
        return new BigDecimal(15);
    }

    @Override
    public String getFullDescription(){
        return "Basic pizza: pizza base with tomato sauce and cheese";
    }
}
