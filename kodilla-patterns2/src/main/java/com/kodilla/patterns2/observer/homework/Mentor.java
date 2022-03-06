package com.kodilla.patterns2.observer.homework;

public class Mentor implements ExerciseObserver{

    private final String mentorName;
    private int count;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Exercises exercises){
        System.out.println(mentorName + ": New exercises from " + exercises.getStudentName() + "\n" +
                "(total: " + exercises.getExerciseList().size() + " exercises.");
        count++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getCount() {
        return count;
    }
}
