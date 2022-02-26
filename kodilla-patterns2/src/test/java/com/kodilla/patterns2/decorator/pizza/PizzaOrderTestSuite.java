package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithBaconPaprikaChickenCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new ChickenMeatDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPizzaCost();
        System.out.println(pizzaCost);
        //Then
        assertEquals(new BigDecimal(23), pizzaCost);
    }

    @Test
    public void testBasicPizzaWithBaconPaprikaChickenDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new ChickenMeatDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getFullDescription();
        System.out.println(description);
        //Then
        assertEquals("Basic pizza: pizza base with tomato sauce and cheese" +
                " + 1 bacon portion" +
                " + 1 paprika portion" +
                " + 1 chicken meat portion", description);
    }

    @Test
    public void testBasicPizzaWithAllIngredientsCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new ChickenMeatDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new SpicyPaprikaDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPizzaCost();
        System.out.println(pizzaCost);
        //Then
        assertEquals(new BigDecimal(31), pizzaCost);
    }

    @Test
    public void testBasicPizzaWithAllIngredientsDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new BaconDecorator(pizzaOrder);
        pizzaOrder = new ChickenMeatDecorator(pizzaOrder);
        pizzaOrder = new MushroomDecorator(pizzaOrder);
        pizzaOrder = new OnionDecorator(pizzaOrder);
        pizzaOrder = new PaprikaDecorator(pizzaOrder);
        pizzaOrder = new SpicyPaprikaDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getFullDescription();
        System.out.println(description);
        //Then
        assertEquals("Basic pizza: pizza base with tomato sauce and cheese" +
                " + 1 bacon portion" +
                " + 1 chicken meat portion" +
                " + 1 mushroom portion" +
                " + 1 onion portion" +
                " + 1 paprika portion" +
                " + 1 spicy paprika portion", description);
    }
}
