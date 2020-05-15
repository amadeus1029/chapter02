package com.javaex.selfPractice01;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TriangleApp {
    public static void main(String[] args) {
        Scanner calcTriangle = new Scanner(System.in);
        int[][] table = new int[3][2];
        Triangle sample = new Triangle();
        System.out.println("삼각형의 크기를 구하는 프로그램입니다,");
        System.out.println("세 꼭지점의 좌표를 입력해야합니다.");

        for(int i=0;i<3;i++) { //꼭지점 한 세트씩 세번 입력
            int x,y;

            do {
                try {
                    System.out.print((i+1)+"번 꼭지점의 x좌표를 입력해주세요: ");
                    x = calcTriangle.nextInt();
                    table[i][0] = x;
                    sample.setX(i,x);
                    break;
                } catch(InputMismatchException ime) {
                    System.out.println("정수값만 입력해주세요");
                    calcTriangle = new Scanner(System.in);
                }
            } while(true);

            do {
                try {
                    System.out.print((i+1)+"번 꼭지점의 y좌표를 입력해주세요: ");
                    y = calcTriangle.nextInt();
                    table[i][1] = y;
                    sample.setY(i,y);
                    break;
                } catch(InputMismatchException ime) {
                    System.out.println("정수값만 입력해주세요");
                    calcTriangle = new Scanner(System.in);
                }
            } while(true);
        }

        if(sample.getSize() == 0) {
            System.out.println("입력하신 좌표 삼각형이 아닙니다");
        } else {
            System.out.println("입력하신 삼각형의 크기는 "+sample.getSize()+" 입니다.");
        }
        calcTriangle.close();
    }
}
