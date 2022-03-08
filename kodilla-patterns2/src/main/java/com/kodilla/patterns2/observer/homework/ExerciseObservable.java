package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface ExerciseObservable {

    void registerObserver(ExerciseObserver exerciseObserver);
    void notifyObservers();
    void removeObserver(ExerciseObserver exerciseObserver);
}
