package com.zyg.behavioral.templateMethod;

public class Actor extends Person {
    @Override
    public void farming() {
    }

    @Override
    public void curing() {
    }

    @Override
    public void acting() {
        System.out.println("表演");
    }

    @Override
    public void traveling() {
        System.out.println("旅游");
    }
}
