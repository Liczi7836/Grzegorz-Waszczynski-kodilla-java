package com.kodilla.kodillarps;

public enum Figure {

    PAPER(1),
    ROCK(2),
    SCISSORS(3),
    LIZARD(4),
    SPOCK(5);

    private final int value;

    Figure(int value) {
        this.value = value;
    }

    static Figure create(String scannerInput) {
        int value = Integer.parseInt(scannerInput);

        for(Figure figure : values()){
            if(figure.value == value){
                return figure;
            }
        }
        throw new IllegalStateException("Wrong input!");
    }
}
