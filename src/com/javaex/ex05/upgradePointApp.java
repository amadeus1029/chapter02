package com.javaex.ex05;

import java.util.Scanner;

public class upgradePointApp {
    public static void main(String[] args) {
        Scanner drawPoint = new Scanner(System.in);
        boolean moreDraw = true;
        Point[] pointsArray = new Point[1];

        System.out.println("포인트 설정을 시작합니다");

        for(int i=0;moreDraw;i++) {
            pointsArray[i] = new Point();
            System.out.print("x좌표: ");
            int x = drawPoint.nextInt();
            pointsArray[i].setX(x);
            System.out.print("y좌표: ");
            int y = drawPoint.nextInt();
            pointsArray[i].setY(y);
            System.out.print("더 그리시겠습니까? (y/n) ");
            char drawMore = drawPoint.next().charAt(0);
            if(drawMore == 'y') {
                Point[] tempPointsArray = new Point[pointsArray.length+1];
                for(int j=0;j<pointsArray.length;j++) {
                    tempPointsArray[j] = pointsArray[j];
                }
                pointsArray = tempPointsArray;
            } else {
                moreDraw = false;
            }
        }
        System.out.println("그리신 "+pointsArray.length+"개의 점 목록");
        for(int i=0;i<pointsArray.length;i++) {
            pointsArray[i].draw();
        }
        System.out.println("");
        System.out.println("목록 출력 종료");

        drawPoint.close();
    }
}
