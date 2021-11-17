package com.kodilla.kodillatesting.collection;



import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create list with 0 numbers, " +
            "then exterminate should return nothing"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();


        //When
        List<Integer> emptyListTest = exterminator.exterminate(new ArrayList<>(emptyList));

        //Then
        Assertions.assertEquals(emptyListTest, emptyList);
    }
    @DisplayName("when create list with numbers, " +
            "then exterminate should return list with even numbers")

    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        Integer[] abcd = new Integer[] {2, 4, 6, 8, 10};
        List<Integer> try1 = Arrays.asList(abcd);
        for(int i = 1; i < 11; i++) {
            normalList.add(i);

        }
        //When
        List<Integer> normalListTest = exterminator2.exterminate(new ArrayList<>(normalList));

        //Then
        Assertions.assertEquals(try1,normalListTest);

    }
}
