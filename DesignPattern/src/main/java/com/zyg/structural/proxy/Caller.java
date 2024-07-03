package com.zyg.structural.proxy;

public class Caller {

    private static Person person;

    public static void main(String[] args) {
        person = new Transporter(new Customer());
        person.buy();
    }
}
