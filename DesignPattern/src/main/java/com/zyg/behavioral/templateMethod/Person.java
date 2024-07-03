package com.zyg.behavioral.templateMethod;

public abstract class Person {
    public void work() {
        eat();
        sleep();
        farming();
        curing();
        acting();
        traveling();
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public abstract void farming();

    public abstract void curing();

    public abstract void acting();

    public void traveling() {}
}
