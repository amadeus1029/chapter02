package com.javaex.ex10;

public class drawPoint {
    public static void main(String[] args) {
        Point testPoint01 = new Point(10,10);
        System.out.println(testPoint01.toString());

        testPoint01.draw();
        testPoint01.draw(false);
    }
}
