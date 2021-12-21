package com.kodilla.flightservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private FlightsRepository flightsRepository = new FlightsRepository();


    public List<String> allCitiesFrom(String city) {
        return flightsRepository.getFlightsList().stream()
                .filter(c -> c.getDepartureCity().equals(city))
                .map(Flight::getArrivalCity)
                .collect(Collectors.toList());
    }

    public List<String> allCitiesTo(String city) {
        return flightsRepository.getFlightsList().stream()
                .filter(c -> c.getArrivalCity().equals(city))
                .map(Flight::getDepartureCity)
                .collect(Collectors.toList());
    }

    public List<String> allCitiesBetween(String cityFrom, String cityTo) {
        List<String> allCitiesBtwn = new ArrayList<>();
        List<String> citiesFrom = allCitiesFrom(cityFrom);
        List<String> citiesTo = allCitiesTo(cityTo);
        for (String cityOne : citiesFrom) {
            for (String cityTwo : citiesTo){
                if (cityTwo.equals(cityOne)){
                    allCitiesBtwn.add(cityOne);
                }
            }

        }
        return allCitiesBtwn;
    }

}
