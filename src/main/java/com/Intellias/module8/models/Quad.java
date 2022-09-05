package com.Intellias.module8.models;

public class Quad extends Shape {

    private int centerX;
    private int centerY;
    private int sideSize;


    public Quad(int centerX, int centerY, int sideSize) {
        this.centerX = centerX;
        this.centerY = centerY;
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
    @Override
    public String getCenterCoordinate() {
        return "x = " + centerX + "; y = " + centerY;
    }
}
