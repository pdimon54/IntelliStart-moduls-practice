package com.Intellias.module8.models;

public class Oval extends Shape {

    private int centerX;
    private int centerY;
    private int minRadius;
    private int maxRadius;

    public Oval(int centerX, int centerY, int minRadius, int maxRadius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.minRadius = minRadius;
        this.maxRadius = maxRadius;
    }



    @Override
    public double getArea() {
        return 3.14*minRadius*maxRadius;
    }

    @Override
    public double getPerimeter() {
        return 4*((3.14*minRadius*maxRadius + Math.pow(maxRadius-minRadius,2))/(minRadius+maxRadius));
    }
    @Override
    public String getCenterCoordinate() {
        return "x = " + centerX + "; y = " + centerY;
    }
}
