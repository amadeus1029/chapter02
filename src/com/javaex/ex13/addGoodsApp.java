package com.javaex.ex13;

public class addGoodsApp {

    public static void main(String[] args) {
        System.out.println(Goods.countGoods);
        Goods computer = new Goods("LG그럄",1000000);
        System.out.println(computer.toString());
        Goods camera = new Goods("니콘",100000);
        System.out.println(camera.toString());
        Goods cup = new Goods("머그컵",100000);
        System.out.println(cup.toString());
        System.out.println(Goods.countGoods);
    }
}
