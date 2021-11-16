package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private final List<Shape> shapes = new ArrayList<>();

    public ShapeCollector() {

    }

    public void addFigure(Shape shape){
        this.shapes.add(shape);
    }

    public int getShapesQuantity(){
        return shapes.size();
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public String showFigures(){
        StringBuilder names = new StringBuilder();
        for(Shape shape : shapes){
            names.append(shape.getShapeName());

        }

        return names.toString();
    }
}
