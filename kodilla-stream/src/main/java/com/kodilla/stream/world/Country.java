package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(BigDecimal peopleQuantity, String countryName) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal people = BigDecimal.ZERO;
        return people.add(peopleQuantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (peopleQuantity != null ? !peopleQuantity.equals(country.peopleQuantity) : country.peopleQuantity != null)
            return false;
        return countryName != null ? countryName.equals(country.countryName) : country.countryName == null;
    }

    @Override
    public int hashCode() {
        int result = peopleQuantity != null ? peopleQuantity.hashCode() : 0;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        return result;
    }
}
