package com.zyg.creational.singleton;

public class Caller {
    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getSingleton();
        HungrySingleton singleton2 = HungrySingleton.getSingleton();

        DCLSingleton singleton3 = DCLSingleton.getSingleton();
        DCLSingleton singleton4 = DCLSingleton.getSingleton();

        StaticInnerClassSingleton singleton5 = StaticInnerClassSingleton.getSingleton();
        StaticInnerClassSingleton singleton6 = StaticInnerClassSingleton.getSingleton();

        EnumSingleton singleton7 = EnumSingleton.SINGLETON;
        EnumSingleton singleton8 = EnumSingleton.SINGLETON;

        System.out.println(singleton1 == singleton2); // true
        System.out.println(singleton3 == singleton4); // true
        System.out.println(singleton5 == singleton6); // true
        System.out.println(singleton7 == singleton8); // true
    }
}
