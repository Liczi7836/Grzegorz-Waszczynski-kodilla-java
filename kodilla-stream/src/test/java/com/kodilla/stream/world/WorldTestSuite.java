package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World("Earth");
        Continent continent = new Continent("Asia");
        Continent continent1 = new Continent("Afica");
        Continent continent2 = new Continent("Europe");
        Country country = new Country(new BigDecimal("1242412422"), "country");
        Country country1 = new Country(new BigDecimal("3452354646"), "country2");
        Country country2 = new Country(new BigDecimal("1232446356"), "Country3");
        Country country3 = new Country(new BigDecimal("2432145563"),"Country4");
        Country country4 = new Country(new BigDecimal("2343535345"), "Country5");
        Country country5 = new Country(new BigDecimal("5645647456"), "Country6");
        continent.addCountry(country);
        continent.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent2.addCountry(country4);
        continent2.addCountry(country5);
        world.addContinent(continent);
        world.addContinent(continent1);
        world.addContinent(continent2);
        //When
        BigDecimal totalQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("16348541788");
        assertEquals(totalQuantity,expectedQuantity);
    }
}
