package com.zyg.structural.proxy;

/**
 * 代理类
 */
public class Transporter implements Person {

    private Person person;

    public Transporter(Person person) {
        this.person = person;
    }

    @Override
    public void buy() {
        System.out.print("外卖员帮");
        person.buy();
    }
}
