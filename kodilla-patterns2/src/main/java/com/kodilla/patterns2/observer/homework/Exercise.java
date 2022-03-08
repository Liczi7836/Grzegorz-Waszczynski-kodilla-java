package com.kodilla.patterns2.observer.homework;

public class Exercise {

    private String exerciseName;
    private String description;

    public Exercise(String exerciseName, String description) {
        this.exerciseName = exerciseName;
        this.description = description;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getDescription() {
        return description;
    }
}
