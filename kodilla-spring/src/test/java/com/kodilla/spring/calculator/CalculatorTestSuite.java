package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;


@SpringBootTest(classes = Calculator.class)
@Component
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations(){
        //Given

        //When
        double result = calculator.add(5.2,2.0);
        double result2 = calculator.sub(6.0,3.0);
        double result3 = calculator.mul(2.0,2.0);
        double result4 = calculator.div(6.0,2.0);
        //Then
        Assertions.assertEquals(result,7.2);
        Assertions.assertEquals(result2,3.0);
        Assertions.assertEquals(result3,4.0);
        Assertions.assertEquals(result4, 3.0);
    }


}
