package com.javaex.ex13;

public class Goods {
    private String name;
    private int price;
    public static int countGoods;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
        this.countGoods = this.countGoods + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCountGoods() {
        return countGoods;
    }

    public static void setCountGoods(int countGoods) {
        Goods.countGoods = countGoods;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", count=" + countGoods +
                '}';
    }
}
