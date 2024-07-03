package com.zyg.creational.factory.factoryMethod.product;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("使用卡车运输");
    }
}
