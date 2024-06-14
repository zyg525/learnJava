package com.zyg.staticFactory.product;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("使用卡车运输");
    }
}
