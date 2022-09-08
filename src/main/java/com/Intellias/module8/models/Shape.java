package com.Intellias.module8.models;

import com.Intellias.module8.util.GeometricHelper.Geometric;

public abstract class Shape implements Geometric {
    private int centerX;   //center coordinate
    private int centerY;

    protected Shape(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public static final String PATTERN = "x = %s; y = %s";


    public String getShapeName(Shape shape){
        return getClass().getCanonicalName();
    }

    public String getCenterCoordinate() {
        return String.format(PATTERN, centerX, centerY);
    }

}
