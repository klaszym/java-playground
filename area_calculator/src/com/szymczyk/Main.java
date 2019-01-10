package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println( "Circle area: " + area(5));
        System.out.println( "Circle area: " + area(-1));
        System.out.println( "Rectangle area: " + area(5.0, 4.0));
        System.out.println( "Rectangle area: " + area(-1.0, 4.0));
    }

    public static double area(double radius){

        if (radius < 0.0) {
            return -1.0;
        }

        double circleArea = radius * radius * 3.14159;
        return circleArea;

    }

    public static double area( double x, double y){

        if (x < 0.0 || y < 0.0) {
            return -1.0;
        }

        double rectangleArea = x * y;
        return rectangleArea;

    }

}
