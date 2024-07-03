package com.zyg.creational.builder;

/**
 * 主管类：负责控制生成步骤
 */
public class Director {
    public void constructBYDCar(CarBuilder carBuilder) {
        carBuilder.reset()
                .setSeat("比亚迪座椅")
                .setEngine("比亚迪引擎")
                .setTripComputer("比亚迪车载电脑")
                .setGPS("北斗导航系统");
    }
}
