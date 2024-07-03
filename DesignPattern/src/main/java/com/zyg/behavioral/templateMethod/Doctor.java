package com.zyg.behavioral.templateMethod;

public class Doctor extends Person {
    @Override
    public void farming() {
    }

    @Override
    public void curing() {
        System.out.println("治疗病人");
    }

    @Override
    public void acting() {
    }
}
