package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;




import static org.junit.jupiter.api.Assertions.*;



public class ArrayOperationsTestSuite {



    @Test
    void testGetAverage(){
        //Given



        Array array = new Array(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20});
        System.out.println(array);
        //When
        double average = array.getAverage(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20});

        //Then
        assertEquals(10.5,average);

    }
}
