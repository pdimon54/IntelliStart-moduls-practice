package com.Intellias.module8.models;

public class Circle extends Shape {

    private int radius;

    public Circle(int centerX, int centerY, int radius) {
        super(centerX,centerY);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

}
