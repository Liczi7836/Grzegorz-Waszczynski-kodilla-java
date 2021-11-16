package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;


    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(new Circle(8.0));
        //Then
        assertEquals(1,shapeCollector.getShapesQuantity());

    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(8.0));
        //When
        boolean result = shapeCollector.removeFigure(new Circle(8.0));
        //Then
        Assertions.assertTrue(result);
        assertEquals(0,shapeCollector.getShapesQuantity());

    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ShapeCollector shapeCollector2 = new ShapeCollector();
        ShapeCollector shapeCollector3 = new ShapeCollector();
        shapeCollector.addFigure(new Circle(8.0));
        shapeCollector2.addFigure(new Circle(4.0));
        shapeCollector3.addFigure(new Circle(2.0));
        //When
        Shape gainedShape = shapeCollector.getFigure(0);
        //Then
        assertEquals(shapeCollector,gainedShape);

    }

    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        ShapeCollector shapeCollector2 = new ShapeCollector();
        ShapeCollector shapeCollector3 = new ShapeCollector();
        shapeCollector.addFigure(new Circle(2.0));
        shapeCollector2.addFigure(new Circle(4.0));
        shapeCollector3.addFigure((new Circle(8.0)));
        //When
        String names = shapeCollector.showFigures();
        //Then
        assertEquals("CircleCircleCircle",names);
    }

}
