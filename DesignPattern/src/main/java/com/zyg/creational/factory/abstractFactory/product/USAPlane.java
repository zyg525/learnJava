package com.zyg.creational.factory.abstractFactory.product;

public class USAPlane implements USATransport {
    @Override
    public void deliver() {
        System.out.println("使用美国飞机运输");
    }
}
