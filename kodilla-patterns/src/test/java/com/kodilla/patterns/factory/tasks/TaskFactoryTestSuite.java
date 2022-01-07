package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskFactoryTestSuite {

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Task: " + "Buying food task",shoppingTask.getTaskName());
        assertEquals("Need to buy " + 10.0 + "Bread", shoppingTask.executeTask());
    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("Task " + "Painting nature task", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("Need to drive to " + "To the beach" + " using " + "Car",drivingTask.executeTask());
        assertTrue(drivingTask.isTaskExecuted());
    }
}
