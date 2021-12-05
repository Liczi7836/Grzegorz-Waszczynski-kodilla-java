package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    HashMap<String, Boolean> flights = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {
        flights.put("Gdansk", true);
        flights.put("Wroclaw", false);
        flights.put("Krakow", true);


                if (!flights.containsKey(flight.getArrivalAirport())) {
                    throw new RouteNotFoundException();
                } else if (flights.get(flight.getArrivalAirport())) {
                    System.out.println("There is a flight to " + flight.getArrivalAirport());
                } else {
                    System.out.println("There isn't any flight to " + flight.getArrivalAirport());
                }


    }

    public static void main(String[] args) {
        Flight flightOne = new Flight("Poznan", "Krakow");
        Flight flightTwo = new Flight("Wroclaw", "Poznan");
        //Flight flightThree = new Flight("Wroclaw", "Warszawa");
        FlightSearch flightSearch = new FlightSearch();
        try{
            flightSearch.findFlight(flightOne);
        } catch (RouteNotFoundException e){
            System.out.println("Flight not found!");
        }
    }
}
