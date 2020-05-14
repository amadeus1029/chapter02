package com.javaex.ex04;

public class AddGoodsApp {
    public static void main(String[] args) {
        Goods computer = new Goods();
        computer.setName("mackbook");
        computer.setPrice(1000000);

        Goods mobilePhone = new Goods();
        mobilePhone.setName("galaxy");
        mobilePhone.setPrice(500000);

        computer.showInfo();
        mobilePhone.showInfo();
    }
}
