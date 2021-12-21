package com.kodilla.flightservice;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {
    private List<Flight> flightsList = new ArrayList<>();

    public FlightsRepository() {
        flightsList.add(new Flight("Wroclaw","Krakow"));
        flightsList.add(new Flight("Wroclaw", "Poznan"));
        flightsList.add(new Flight("Wroclaw", "Warszawa"));
        flightsList.add(new Flight("Warszawa", "Poznan"));
        flightsList.add(new Flight("Warszawa", "Krakow"));
        flightsList.add(new Flight("Warszawa", "Wroclaw"));
        flightsList.add(new Flight("Poznan", "Krakow"));
        flightsList.add(new Flight("Poznan", "Gdansk"));
        flightsList.add(new Flight("Poznan", "Lodz"));

    }



    public List<Flight> getFlightsList(){
        return flightsList;
    }


}
