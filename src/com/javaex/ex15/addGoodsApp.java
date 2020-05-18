package com.javaex.ex15;

public class addGoodsApp {
    public static void main(String[] args) {
        Goods[] goodsArray = new Goods[3];

        Goods computer = new Goods("엘지그램",1000000);
        Goods camera = new Goods("캐논",500000);
        Goods cup = new Goods("머그컵",10000);

        goodsArray[0] = computer;
        goodsArray[1] = camera;
        goodsArray[2] = cup;

        //이거 그냥 배열 자체를 출력해도 알아서 toString 찾는 특성이 있음
        for(int i=0;i<goodsArray.length;i++) {
            System.out.println(goodsArray[i].toString());
        }
    }
}
