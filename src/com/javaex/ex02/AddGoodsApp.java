package com.javaex.ex02;

import java.util.Scanner;

public class AddGoodsApp {
    public static void main(String[] args) {
        Scanner addGoods = new Scanner(System.in);
        Goods[] goodsArray = new Goods[1]; // 입력받을 배열 생성
        boolean addMore = true; //반복문 탈출요건 정의

        System.out.println("상품 등록을 시작하세요");

        for(int i=0;addMore;i++) {
            goodsArray[i] = new Goods(); //메모리에 올림
            System.out.print("상품명: ");
            goodsArray[i].name = addGoods.next();
            System.out.print("가격: ");
            goodsArray[i].price = addGoods.nextInt();
            System.out.print("더 추가하시겠습니까? (y/n)");
            char wantMore = addGoods.next().charAt(0);
            if(wantMore == 'y') {
                Goods[] tempGoodsArray = new Goods[goodsArray.length+1]; //지금까지 입력한 배열보다 하나 더 긴 배열 생성
                // System.arraycopy(goodsArray,0,tempGoodsArray,0,goodsArray.length);
                for(int j=0;j<goodsArray.length;j++) { //새로 생성한 배열에 기존 배열 복사
                    tempGoodsArray[j] = goodsArray[j];
                }
                goodsArray = tempGoodsArray; //배열 바꿔치기
            } else {
                addMore = false; //반복문 탈출
            }
        }
        System.out.println("등록하신 상품의 목록은 총 "+goodsArray.length+"개이며");
        for(int i=0;i<goodsArray.length;i++) {
            System.out.println((i+1)+". "+"상품명: "+goodsArray[i].name+"\t가격: "+goodsArray[i].price);
        }
        System.out.println("이상입니다.");
        addGoods.close();

    }
}
