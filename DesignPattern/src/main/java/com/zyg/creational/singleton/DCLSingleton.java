package com.zyg.creational.singleton;

/**
 * 懒汉式单例模式-双重检验锁
 */
public class DCLSingleton {
    private static volatile DCLSingleton singleton;

    private DCLSingleton() {}

    public static DCLSingleton getSingleton() {
        if(singleton == null) {
            synchronized (DCLSingleton.class) {
                if(singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
