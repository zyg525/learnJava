package com.zyg.creational.singleton;

/**
 * 饿汉式单例模式
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
