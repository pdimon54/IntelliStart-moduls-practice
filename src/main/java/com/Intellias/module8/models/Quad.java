package com.Intellias.module8.models;

public class Quad extends Shape {

    private int sideSize;

    public Quad(int centerX, int centerY, int sideSize) {
        super(centerX,centerY);
        this.sideSize = sideSize;
    }

    @Override
    public double getArea() {
        return Math.pow(sideSize,2);
    }

    @Override
    public double getPerimeter() {
        return 4*sideSize;
    }

}
