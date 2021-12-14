package com.kodilla.flightservice;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {
    private List<Flight> flightsList = new ArrayList<>();

    public void addFlight(Flight flight){
        flightsList.add(flight);
    }

    public List<Flight> getFlightsList(){
        return flightsList;
    }


}
