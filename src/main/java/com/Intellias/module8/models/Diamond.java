package com.Intellias.module8.models;

public class Diamond extends Shape {

    private int minDiagonal;
    private int maxDiagonal;

    public Diamond(int centerX, int centerY, int minDiagonal, int maxDiagonal) {
        super(centerX,centerY);
        this.minDiagonal = minDiagonal;
        this.maxDiagonal = maxDiagonal;
    }

    @Override
    public double getArea() {
        return 0.5*minDiagonal*maxDiagonal;
    }

    @Override
    public double getPerimeter() {
        return 4*(Math.sqrt(Math.pow(minDiagonal,2)+Math.pow(maxDiagonal,2)));
    }

}
