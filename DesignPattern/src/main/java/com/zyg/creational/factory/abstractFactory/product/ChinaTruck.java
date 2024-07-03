package com.zyg.creational.factory.abstractFactory.product;

public class ChinaTruck implements ChinaTransport {
    @Override
    public void deliver() {
        System.out.println("使用中国卡车运输");
    }
}
