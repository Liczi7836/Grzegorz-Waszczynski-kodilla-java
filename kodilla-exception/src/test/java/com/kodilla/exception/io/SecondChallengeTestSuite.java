package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void secondChallengeSuccessfullyTest() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,2.0));
    }

    @ParameterizedTest
    @CsvSource({
            "3.0, 5.0",
            "2.0, 6.5",
            "0.5, 10.0",
            "1.5, 1.5"
    })
    void secondChallengeTestEdgeCases(double x, double y){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x,y));
    }
}
