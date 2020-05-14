package com.javaex.ex05;

public class PointApp {
    public static void main(String[] args) {
        Point point01 = new Point();
        Point point02 = new Point();

        point01.setX(5);
        point01.setY(5);
        point02.setX(10);
        point02.setY(23);

        point01.draw();
        point02.draw();
    }
}
