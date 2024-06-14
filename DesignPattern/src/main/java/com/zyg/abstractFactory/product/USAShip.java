package com.zyg.abstractFactory.product;

public class USAShip implements USATransport {
    @Override
    public void deliver() {
        System.out.println("使用美国轮船运输");
    }
}
