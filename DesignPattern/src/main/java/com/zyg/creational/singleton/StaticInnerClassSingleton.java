package com.zyg.creational.singleton;

/**
 * 懒汉式单例模式-静态内部类
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getSingleton() {
        return InnerClass.singleton;
    }
}
