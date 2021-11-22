package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static final String name = "Circle";
    private final double PI = 3.14;
    private final double r;


    public Circle(double r) {
        this.r = r;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(PI);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
    return PI * (r*r);
    }


}
