package com.Intellias.module8.models;

public class Circle extends Shape {

    private int centerX;
    private int centerY;
    private int radius;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }



    @Override
    public double getArea() {
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String getCenterCoordinate() {
        return "x = " + centerX + "; y = " + centerY;
    }
}
