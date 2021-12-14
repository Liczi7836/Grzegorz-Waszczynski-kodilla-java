package com.kodilla.flightservice;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private FlightsList flightsList = new FlightsList();


    public List<String> allCitiesFrom(String city){
        return flightsList.getFlightsList().stream()
                .filter(c -> c.getDepartureCity().equals(city))
                .map(Flight::getArrivalCity)
                .collect(Collectors.toList());
    }

    public List<String> allCitiesTo(String city){
        return flightsList.getFlightsList().stream()
                .filter(c -> c.getArrivalCity().equals(city))
                .map(Flight::getDepartureCity)
                .collect(Collectors.toList());
    }

    public List<String> allCitiesBetween(String cityFrom, String cityTo){
            return flightsList.getFlightsList().stream()
                    .filter(c -> c.getArrivalCity().equals(cityTo))
                    .filter(d -> d.getDepartureCity().equals(cityFrom))
                    .map(Flight::getArrivalCity)
                    .collect(Collectors.toList());
    }

}
