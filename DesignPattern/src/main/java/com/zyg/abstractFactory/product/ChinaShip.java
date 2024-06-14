package com.zyg.abstractFactory.product;

public class ChinaShip implements ChinaTransport {
    @Override
    public void deliver() {
        System.out.println("使用中国轮船运输");
    }
}
