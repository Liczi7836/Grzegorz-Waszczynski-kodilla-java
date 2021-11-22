package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continents= new ArrayList<>();
    private final String worldName;

    public World(String worldName) {
        this.worldName = worldName;
    }

    public String getWorldName() {
        return worldName;
    }

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent){
        return continents.remove(continent);
    }

    public List<Continent> getContinents(){
        return continents;
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(world -> world.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
