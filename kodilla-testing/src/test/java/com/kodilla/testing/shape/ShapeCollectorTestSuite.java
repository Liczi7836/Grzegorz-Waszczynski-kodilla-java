package com.kodilla.testing.shape;


import org.junit.jupiter.api.*;

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
        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        //Then
        Assertions.assertEquals(1,shapeCollector.getShapesQuantity());

    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        //When
        boolean result = shapeCollector.removeFigure(new Circle(8.0,"Circle1"));
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,shapeCollector.getShapesQuantity());

    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        shapeCollector.addFigure(new Circle(4.0,"Circle2"));
        shapeCollector.addFigure(new Circle(2.0,"Circle3"));
        //When
        Shape gainedShape = shapeCollector.getFigure(1);
        //Then
        Assertions.assertEquals(new Circle(4.0,"Circle2"),gainedShape);

    }

    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        shapeCollector.addFigure(new Circle(4.0,"Circle2"));
        shapeCollector.addFigure(new Circle(2.0,"Circle3"));
        //When
        String names = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals("Circle1Circle2Circle3",names);
    }

}
