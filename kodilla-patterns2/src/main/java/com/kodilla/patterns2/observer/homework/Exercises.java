package com.kodilla.patterns2.observer.homework;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class Exercises implements ExerciseObservable{
    private final List<ExerciseObserver> observers;
    private final List<Exercise> exerciseList;
    private final String studentName;

    public Exercises(String studentName) {
        observers = new ArrayList<>();
        exerciseList = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addExercise(Exercise exercise){
        exerciseList.add(exercise);
        notifyObservers();
    }

    @Override
    public void registerObserver(ExerciseObserver exerciseObserver){
        observers.add(exerciseObserver);
    }

    @Override
    public void notifyObservers(){
        for (ExerciseObserver observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(ExerciseObserver exerciseObserver){
        observers.remove(exerciseObserver);
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public String getStudentName() {
        return studentName;
    }
}
