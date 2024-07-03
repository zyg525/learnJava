package com.zyg.creational.factory.staticFactory.product;

public class Plane implements Transport {
    @Override
    public void deliver() {
        System.out.println("使用飞机运输");
    }
}
