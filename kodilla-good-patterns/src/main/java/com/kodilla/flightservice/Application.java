package com.kodilla.flightservice;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();

        List<String> citiesFromWroclaw = flightService.allCitiesFrom("Wroclaw");
        List<String> citiesToWroclaw = flightService.allCitiesTo("Wroclaw");
        List<String> citiesBetweenWroclawAndGdansk = flightService.allCitiesBetween("Wroclaw", "Gdansk");

        System.out.println("List of cities to fly to from Wroclaw: " + citiesFromWroclaw);
        System.out.println("List of cities from which you can fly to Wroclaw: " + citiesToWroclaw);
        System.out.println("List of cities between Wroclaw and Gdansk: " + citiesBetweenWroclawAndGdansk);


    }
}
