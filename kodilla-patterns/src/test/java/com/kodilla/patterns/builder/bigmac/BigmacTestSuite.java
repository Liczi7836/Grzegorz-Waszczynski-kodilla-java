package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void newBigMacTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("letuce")
                .bun("sesame")
                .burgers(2)
                .ingredients("bacon")
                .sauce("spicy")
                .ingredients("onion")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3,howManyIngredients);
    }

}
