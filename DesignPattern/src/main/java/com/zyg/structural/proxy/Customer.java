package com.zyg.structural.proxy;

/**
 * 被代理类
 */
public class Customer implements Person {
    public void buy() {
        System.out.println("小明买一碗面");
    }
}
