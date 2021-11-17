package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double PI = 3.14;
    private double r;
    private String name;

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.PI, PI) != 0) return false;
        if (Double.compare(circle.r, r) != 0) return false;
        return name != null ? name.equals(circle.name) : circle.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(PI);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
    return PI * (r*r);
    }


}
