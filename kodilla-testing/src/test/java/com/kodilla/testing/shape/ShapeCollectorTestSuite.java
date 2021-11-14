package com.kodilla.testing.shape;

import com.kodilla.testing.shape.ShapeCollector;
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
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(8.0,"Circle1"));
        //When
        shapeCollector.addFigure((Shape) shapeCollector);
        //Then
        Assertions.assertEquals(1,shapeCollector.getShapesQuantity());

    }

    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(8.0,"Circle1"));
        //When
        boolean result = shapeCollector.removeFigure((Shape) shapeCollector);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0,shapeCollector.getShapesQuantity());

    }

    @Test
    void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(8.0,"Circle1"));
        ShapeCollector shapeCollector2 = new ShapeCollector(new Circle(4.0,"Circle2"));
        ShapeCollector shapeCollector3 = new ShapeCollector(new Circle(2.0,"Circle3"));
        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        shapeCollector2.addFigure(new Circle(4.0,"Circle2"));
        shapeCollector3.addFigure(new Circle(2.0,"Circle3"));
        //When
        ShapeCollector gainedShape = shapeCollector.getFigure(1);
        //Then
        Assertions.assertEquals(shapeCollector2,gainedShape);

    }

    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector(new Circle(8.0,"Circle1"));
        ShapeCollector shapeCollector2 = new ShapeCollector(new Circle(4.0,"Circle2"));
        ShapeCollector shapeCollector3 = new ShapeCollector(new Circle(2.0,"Circle3"));
        shapeCollector.addFigure(new Circle(8.0,"Circle1"));
        shapeCollector2.addFigure(new Circle(4.0,"Circle2"));
        shapeCollector3.addFigure(new Circle(2.0,"Circle3"));
        //When
        String names = shapeCollector.showFigures();
        //Then
        Assertions.assertEquals("Circle1Circle2Circle3",names);
    }

}
