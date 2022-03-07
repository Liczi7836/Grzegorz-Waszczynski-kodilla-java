package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercisesTestSuite {

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
        johnWick.removeObserver(klaudiusz);
        //When
        johnWick.addExercise(new Exercise("Java!", "Programming java app"));
        johnWick.addExercise(new Exercise("HTML!", "Programming websites with html"));
        mikeWazowsky.addExercise(new Exercise("Math", "Calculating everything"));
        superMan.addExercise(new Exercise("History", "How to not start WW3"));
        superMan.addExercise(new Exercise("Programming for begginers", "How to program first app for space rocket"));
        superMan.addExercise(new Exercise("Chemistry for A+", "How to not create bomb"));
        batMan.addExercise(new Exercise("FrontEnd", "Programming website"));
        batMan.addExercise(new Exercise("PE", "Record jumping for 2h"));
        johnWick.notifyObservers();
        mikeWazowsky.notifyObservers();
        superMan.notifyObservers();
        batMan.notifyObservers();
        //Then
        assertEquals(5, jacek.getCount());
        assertEquals(6, piotr.getCount());
        assertEquals(2, klaudiusz.getCount());
    }
}
