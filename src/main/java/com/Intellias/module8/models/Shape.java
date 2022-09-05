package com.Intellias.module8.models;

import com.Intellias.module8.util.GeometricHelper.Geometric;

public abstract class Shape implements Geometric {
    private int centerX;   //center coordinate
    private int centerY;


    public String getShapeName(Shape shape){
        return getClass().getCanonicalName();
    }


}
