package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void addCountry(Country country){
        countries.add(country);
    }

    public boolean removeCountry(Country country){
        return countries.remove(country);
    }

    public List<Country> getCountries(){
        return countries;
    }
}
