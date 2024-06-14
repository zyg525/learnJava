package com.zyg.abstractFactory.product;

public class USATruck implements USATransport {
    @Override
    public void deliver() {
        System.out.println("使用美国卡车运输");
    }
}
