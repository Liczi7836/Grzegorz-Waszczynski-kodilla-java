package com.kodilla.flightservice;

public class AllFlights {

    private FlightsList flightsList = new FlightsList();

   Flight flight0 = new Flight("Wroclaw","Krakow");
   Flight flight1 = new Flight("Wroclaw", "Poznan");
   Flight flight2 = new Flight("Wroclaw", "Warszawa");
   Flight flight3 = new Flight("Warszawa", "Poznan");
   Flight flight4 = new Flight("Warszawa", "Krakow");
   Flight flight5 = new Flight("Warszawa", "Wroclaw");
   Flight flight6 = new Flight("Poznan", "Krakow");
   Flight flight7 = new Flight("Poznan", "Gdansk");
   Flight flight8 = new Flight("Poznan", "Lodz");

   public void addFlights(){
       flightsList.addFlight(flight0);
       flightsList.addFlight(flight1);
       flightsList.addFlight(flight2);
       flightsList.addFlight(flight3);
       flightsList.addFlight(flight4);
       flightsList.addFlight(flight5);
       flightsList.addFlight(flight6);
       flightsList.addFlight(flight7);
       flightsList.addFlight(flight8);
   }
}
