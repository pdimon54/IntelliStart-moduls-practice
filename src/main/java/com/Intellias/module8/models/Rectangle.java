package com.Intellias.module8.models;


public class Rectangle extends Shape {

    private int centerX;
    private int centerY;
    private int minSideSize;
    private int maxSideSize;

    public Rectangle(int centerX, int centerY, int minSideSize, int maxSideSize) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.minSideSize = minSideSize;
        this.maxSideSize = maxSideSize;
    }


    @Override
    public double getArea() {
        return minSideSize*maxSideSize;
    }

    @Override
    public double getPerimeter() {
        return 2*(minSideSize*maxSideSize);
    }
    @Override
    public String getCenterCoordinate() {
        return "x = " + centerX + "; y = " + centerY;
    }

}
