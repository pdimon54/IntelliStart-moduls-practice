package com.Intellias.module8.models;


public class Rectangle extends Shape {

    private int minSideSize;
    private int maxSideSize;

    public Rectangle(int centerX, int centerY, int minSideSize, int maxSideSize) {
        super(centerX,centerY);
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

}
