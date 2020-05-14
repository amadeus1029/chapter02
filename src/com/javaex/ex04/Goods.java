package com.javaex.ex04;

public class Goods {
    private String name;
    private int price;

    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setPrice(int money) {
        price = money;
    }
    public int getPrice() {
        return price;
    }
    public void showInfo() {
        System.out.println("상품: "+name);
        System.out.println("가격: "+price);
        System.out.println("");
    }
}
