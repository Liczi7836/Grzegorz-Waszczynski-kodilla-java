package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buying food task", "Bread", 10);
            case PAINTINGTASK:
                return new PaintingTask("Painting nature task", "Green", "Grass");
            case DRIVINGTASK:
                return new DrivingTask("Driving to swim task", "To the beach", "Car");
            default:
                return null;
        }
    }
}
