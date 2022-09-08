package com.Intellias.module8.models;

public class Oval extends Shape {

    private int minRadius;
    private int maxRadius;

    public Oval(int centerX, int centerY, int minRadius, int maxRadius) {
        super(centerX,centerY);
        this.minRadius = minRadius;
        this.maxRadius = maxRadius;
    }

    @Override
    public double getArea() {
        return Math.PI*minRadius*maxRadius;
    }

    @Override
    public double getPerimeter() {
        return 4*((Math.PI*minRadius*maxRadius + Math.pow(maxRadius-minRadius,2))/(minRadius+maxRadius));
    }

}
