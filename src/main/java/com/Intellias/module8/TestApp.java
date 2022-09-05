package com.Intellias.module8;

import com.Intellias.module8.models.*;
import com.Intellias.module8.util.GeometricHelper.GeometricHelper;

public class TestApp {
    public static void main(String[] args) {
        Oval oval = new Oval(2,3,4,5);
        Circle circle = new Circle(3,4,5);
        Diamond diamond = new Diamond(2,5,7,8);
        Quad quad = new Quad(1,4,6);
        Rectangle rectangle = new Rectangle(-1,4,5,6);
        System.out.println("=====================================================");
        System.out.println("OVAL:");
        System.out.println(GeometricHelper.getShapeName(oval));
        System.out.println(GeometricHelper.getArea(oval));
        System.out.println(GeometricHelper.getPerimeter(oval));
        System.out.println(GeometricHelper.getCenterCoordinate(oval));
        System.out.println("=====================================================");

        System.out.println("=====================================================");
        System.out.println("CIRCLE:");
        System.out.println(GeometricHelper.getShapeName(circle));
        System.out.println(GeometricHelper.getArea(circle));
        System.out.println(GeometricHelper.getPerimeter(circle));
        System.out.println(GeometricHelper.getCenterCoordinate(circle));
        System.out.println("=====================================================");

        System.out.println("=====================================================");
        System.out.println("DIAMOND:");
        System.out.println(GeometricHelper.getShapeName(diamond));
        System.out.println(GeometricHelper.getArea(diamond));
        System.out.println(GeometricHelper.getPerimeter(diamond));
        System.out.println(GeometricHelper.getCenterCoordinate(diamond));
        System.out.println("=====================================================");

        System.out.println("=====================================================");
        System.out.println("QUAD:");
        System.out.println(GeometricHelper.getShapeName(quad));
        System.out.println(GeometricHelper.getArea(quad));
        System.out.println(GeometricHelper.getPerimeter(quad));
        System.out.println(GeometricHelper.getCenterCoordinate(quad));
        System.out.println("=====================================================");

        System.out.println("=====================================================");
        System.out.println("RECTANGLE:");
        System.out.println(GeometricHelper.getShapeName(rectangle));
        System.out.println(GeometricHelper.getArea(rectangle));
        System.out.println(GeometricHelper.getPerimeter(rectangle));
        System.out.println(GeometricHelper.getCenterCoordinate(rectangle));
        System.out.println("=====================================================");

    }
}
