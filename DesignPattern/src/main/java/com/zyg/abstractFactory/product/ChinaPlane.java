package com.zyg.abstractFactory.product;

public class ChinaPlane implements ChinaTransport {
    @Override
    public void deliver() {
        System.out.println("使用中国飞机运输");
    }
}
