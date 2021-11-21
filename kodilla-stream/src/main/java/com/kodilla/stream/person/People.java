package com.kodilla.stream.person;
import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList() {
        final List<String> people = new ArrayList<>();

        people.add("John Smith");
        people.add("Dorothy Newman");
        people.add("John Wolkowitz");
        people.add("Lucy Riley");
        people.add("Owen Rogers");
        people.add("Matilda Davies");
        people.add("Declan Booth");
        people.add("Corinne Foster");
        people.add("Khloe fry");
        people.add("Martin Valenzuela");

        return new ArrayList<>(people);
    }
}
