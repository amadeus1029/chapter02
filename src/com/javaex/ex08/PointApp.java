package com.javaex.ex08;

public class PointApp {
    public static void main(String[] args) {
        //디폴트 생성자를 이용해서 인스턴스 생성
        Point testDefault = new Point();

        //값을 미리 넣어주는 생성자 이용
        Point testConst = new Point(3,4);
    }
}
