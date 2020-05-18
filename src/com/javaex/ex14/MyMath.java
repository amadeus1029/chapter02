package com.javaex.ex14;

public class MyMath {
    public static double PI = 3.14;

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double circleArea(int radius) {
        return radius * radius * PI;
    }
}
