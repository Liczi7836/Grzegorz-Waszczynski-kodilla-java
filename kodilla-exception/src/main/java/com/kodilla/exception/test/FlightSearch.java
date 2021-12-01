package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    HashMap<String, Boolean> flights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flights.put("Gdansk", true);
        flights.put("Wroclaw", false);
        flights.put("Krakow", true);
        for (String city : flights.keySet()) {
            if (!city.equals(flight.getArrivalAirport())) {
                throw new RouteNotFoundException();
            }
        }

    }

    public static void main(String[] args) {
        Flight flightOne = new Flight("Krakow", "Poznan");
        //Flight flightTwo = new Flight("Poznan", "Wroclaw");
        //Flight flightThree = new Flight("Wroclaw", "Warszawa");
        FlightSearch flightSearch = new FlightSearch();
        try{
            flightSearch.findFlight(flightOne);
        } catch (RouteNotFoundException e){
            System.out.println("Flight not found!");
        }
    }
}
