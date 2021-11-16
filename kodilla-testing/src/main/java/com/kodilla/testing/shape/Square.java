package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private double a;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        return name != null ? name.equals(square.name) : square.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return a*a;

    }
}
