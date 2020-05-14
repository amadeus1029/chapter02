package com.javaex.ex02;

import java.util.Scanner;

public class AddGoodsApp2 {
    public static void main(String[] args) {
        //상품을 무한으로 입력하되 메뉴도 반복되는 코드를 만들어보자 (진헌태가 시킴 ㅋㅋㅋㅋ)
        Scanner addGoods = new Scanner(System.in);
        Goods[] goodsArray = new Goods[1]; // 입력받을 배열 생성
        boolean programWork = true;

        for(int i=0;programWork;) {
            System.out.println("메뉴를 선택해주세요");
            System.out.println("1.추가하기\t2.리스트보기\t3.종료하기");
            int menu = addGoods.nextInt();
            switch (menu) {
                case 1 :
                    if(i!=0) {
                        Goods[] tempGoodsArray = new Goods[goodsArray.length+1]; //지금까지 입력한 배열보다 하나 더 긴 배열 생성
                        for(int j=0;j<goodsArray.length;j++) { //새로 생성한 배열에 기존 배열 복사
                            tempGoodsArray[j] = goodsArray[j];
                        }
                        goodsArray = tempGoodsArray; //배열 바꿔치기
                    }
                    goodsArray[i] = new Goods(); //메모리에 올림
                    System.out.print("상품명: ");
                    goodsArray[i].name = addGoods.next();
                    System.out.print("가격: ");
                    goodsArray[i].price = addGoods.nextInt();
                    i++;
                    break;
                case 2 :
                    System.out.println("등록하신 상품의 목록은 총 "+goodsArray.length+"개이며");
                    for(int j=0;j<goodsArray.length;j++) {
                        System.out.println((j+1)+". "+"상품명: "+goodsArray[j].name+"\t가격: "+goodsArray[j].price);
                    }
                    break;
                case 3 :
                    System.out.println("상품등록을 종료합니다");
                    programWork = false;
                    break;
                default :
                    System.out.println("잘못 입력하셨습니다, 다시 입력해주세요");
            }
        }
        addGoods.close();
    }
}
