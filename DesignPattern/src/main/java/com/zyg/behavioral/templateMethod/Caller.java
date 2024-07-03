package com.zyg.behavioral.templateMethod;

public class Caller {


    public static void main(String[] args) {
        Person farmer = new Farmer();
        farmer.work();

        System.out.println("-----");

        Person doctor = new Doctor();
        doctor.work();

        System.out.println("-----");

        Person actor = new Actor();
        actor.work();
    }
}
