package com.javaex.ex05;

public class Point {
    private int x,y;
    public void setX(int num) {
        x = num;
    }
    public int getX() {
        return x;
    }
    public void setY(int num) {
        y = num;
    }
    public int getY() {
        return y;
    }
    public void draw() {
        System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
    }
}
