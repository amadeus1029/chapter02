package com.javaex.ex01;

public class AddGoodsApp {
    public static void main(String[] args) {
        Goods camera = new Goods();

        camera.name = "NIKON";
        camera.price = 200000;

        System.out.println(camera.name);
        System.out.println(camera.price);
        System.out.println(camera.amount);
    }
}
