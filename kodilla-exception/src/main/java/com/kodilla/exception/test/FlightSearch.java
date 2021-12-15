package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    HashMap<String, Boolean> flights = new HashMap<>(){{
        put("Gdansk", true);
        put("Wroclaw", false);
        put("Krakow", true);
    }};



    public void findFlight(Flight flight) throws RouteNotFoundException {



                if (!flights.containsKey(flight.getArrivalAirport())) {
                    throw new RouteNotFoundException();
                } else if (flights.get(flight.getArrivalAirport())) {
                    System.out.println("There is a flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
                } else {
                    System.out.println("There is a flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
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
