package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercisesTestSuite {

    Exercise exercise1 = new Exercise("Java!", "Programming java app");
    Exercise exercise2 = new Exercise("HTML!", "Programming websites with html");
    Exercise exercise3 = new Exercise("Math", "Calculating everything");
    Exercise exercise4 = new Exercise("History", "How to not start WW3");
    Exercise exercise5 = new Exercise("Programming for begginers", "How to program first app for space rocket");
    Exercise exercise6 = new Exercise("Chemistry for A+", "How to not create bomb");
    Exercise exercise7 = new Exercise("FrontEnd", "Programming website");
    Exercise exercise8 = new Exercise("PE", "Record jumping for 2h");

    @Test
    public void testUpdate(){
        //Given
        Exercises johnWick = new FirstStudent();
        Exercises mikeWazowsky = new SecondStudent();
        Exercises superMan = new ThirdStudent();
        Exercises batMan = new FourthStudent();
        Mentor jacek = new Mentor("Jacek");
        Mentor piotr = new Mentor("Piotr");
        Mentor klaudiusz = new Mentor("Klaudiusz");
        johnWick.registerObserver(jacek);
        mikeWazowsky.registerObserver(jacek);
        superMan.registerObserver(piotr);
        mikeWazowsky.registerObserver(piotr);
        batMan.registerObserver(jacek);
        batMan.registerObserver(piotr);
        batMan.registerObserver(klaudiusz);
        johnWick.registerObserver(klaudiusz);
        mikeWazowsky.registerObserver(klaudiusz);
        johnWick.removeObserver(klaudiusz);
        //When
        johnWick.addExercise(exercise1);
        johnWick.addExercise(exercise2);
        mikeWazowsky.addExercise(exercise3);
        superMan.addExercise(exercise4);
        superMan.addExercise(exercise5);
        superMan.addExercise(exercise6);
        batMan.addExercise(exercise7);
        batMan.addExercise(exercise8);
        //Then
        assertEquals(5, jacek.getCount());
        assertEquals(6, piotr.getCount());
        assertEquals(3, klaudiusz.getCount());
        assertEquals("Jacek", jacek.getMentorName());
        assertEquals("Java!", exercise1.getExerciseName());
        assertEquals("Programming java app", exercise1.getDescription());
    }
}
