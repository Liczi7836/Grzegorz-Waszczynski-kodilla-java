package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double h;
    private double a;
    private String name;

    public Triangle(double h, double a, String name) {
        this.h = h;
        this.a = a;
        this.name = name;
    }

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.h, h) != 0) return false;
        if (Double.compare(triangle.a, a) != 0) return false;
        return name != null ? name.equals(triangle.name) : triangle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(h);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String getShapeName(){
        return "Triangle";
    }

    public double getField(){
    return 0.5 * h * a;
    }
}
