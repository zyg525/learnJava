package com.zyg.creational.builder;

/**
 * 生成器接口
 */
public interface CarBuilder {
    CarBuilder reset();
    CarBuilder setSeat(String seat);
    CarBuilder setEngine(String engine);
    CarBuilder setTripComputer(String tripComputer);
    CarBuilder setGPS(String GPS);
}
