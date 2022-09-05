package com.Intellias.module8.util.GeometricHelper;

import com.Intellias.module8.models.Shape;

public class GeometricHelper{

    public static String getShapeName(Shape shape) {
        return shape.getClass().getSimpleName();
    }

    public static double getArea(Shape shape) {
        return shape.getArea();
    }

    public static double getPerimeter(Shape shape) {
        return shape.getPerimeter();
    }
    public static String getCenterCoordinate(Shape shape) {
        return shape.getCenterCoordinate();
    }
}
