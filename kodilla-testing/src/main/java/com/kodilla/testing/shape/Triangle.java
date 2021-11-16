package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final double h;
    private final double a;
    private static final String name = "Triangle";


    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.h, h) != 0) return false;
        return Double.compare(triangle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
    return 0.5 * h * a;
    }
}
