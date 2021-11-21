package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class Array implements ArrayOperations {
    private final int[] numbers;

    public Array(final int[] numbers) {
        this.numbers = numbers;
    }



    @Override
    public String toString() {
        return "Array{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public double getAverage(int[] numbers){
            IntStream.range(0, numbers.length)
                            .map(i -> numbers[i])
                .forEach(System.out::println);
        double average = IntStream.range(0,numbers.length)
                .map(i -> numbers[i])
                .average().getAsDouble();
        return average;
    }


}
