package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.LOGINSTANCE;
        logger.log("Starting program");
    }

    @Test
    void getLastLogTest() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        assertEquals("Starting program", lastLog);
    }
}
