package com.zyg.creational.factory.staticFactory.product;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("使用轮船运输");
    }
}
