package com.zyg.creational.builder;

public class Caller {
    public static void main(String[] args) {

        // 构造汽车
        Director director = new Director();
        BYDBuilder bydBuilder = new BYDBuilder();
        director.constructBYDCar(bydBuilder);

        // 获取构造好的汽车
        Car car = bydBuilder.getCar();
        System.out.println(car);
    }
}
