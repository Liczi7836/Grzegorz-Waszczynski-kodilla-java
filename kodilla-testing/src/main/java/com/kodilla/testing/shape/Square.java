package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String name = "Square";
    private final double a;

    public Square(double a) {
        this.a = a;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(a);
        return (int) (temp ^ (temp >>> 32));
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return a*a;

    }
}
