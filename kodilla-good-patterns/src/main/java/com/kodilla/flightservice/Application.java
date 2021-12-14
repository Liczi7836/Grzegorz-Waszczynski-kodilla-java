package com.kodilla.flightservice;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args){

        Flight flight0 = new Flight("Wroclaw","Krakow");
        Flight flight1 = new Flight("Wroclaw", "Poznan");
        Flight flight2 = new Flight("Wroclaw", "Warszawa");
        Flight flight3 = new Flight("Warszawa", "Poznan");
        Flight flight4 = new Flight("Warszawa", "Krakow");
        Flight flight5 = new Flight("Warszawa", "Wroclaw");
        Flight flight6 = new Flight("Poznan", "Krakow");
        Flight flight7 = new Flight("Poznan", "Gdansk");
        Flight flight8 = new Flight("Poznan", "Lodz");
    AllFlights allFlights = new AllFlights();
    FlightService flightService = new FlightService();
    FlightsList flightsList = new FlightsList();
    flightsList.addFlight(flight0);
    flightsList.addFlight(flight1);
    flightsList.addFlight(flight2);
    flightsList.addFlight(flight3);
    flightsList.addFlight(flight4);
    flightsList.addFlight(flight5);
    flightsList.addFlight(flight6);
    flightsList.addFlight(flight7);
    flightsList.addFlight(flight8);
    //allFlights.addFlights();

        List<String> citiesFromWroclaw = flightService.allCitiesFrom("Wroclaw");
        List<String> citiesToWroclaw = flightService.allCitiesTo("Wroclaw");
        List<String> citiesBetweenWroclawAndGdansk = flightService.allCitiesBetween("Wroclaw","Gdansk");

        System.out.println(Arrays.toString(flightsList.getFlightsList().toArray()));
        System.out.println("List of cities to fly to from Wroclaw: " + citiesFromWroclaw);
        System.out.println("List of cities from which you can fly to Wroclaw: " + citiesToWroclaw);
        System.out.println("List of cities between Wroclaw and Gdansk: " + citiesBetweenWroclawAndGdansk);




    }
}
