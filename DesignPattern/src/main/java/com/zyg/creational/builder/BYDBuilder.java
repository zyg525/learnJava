package com.zyg.creational.builder;

/**
 * 生成器实现类
 */
public class BYDBuilder implements CarBuilder {

    private Car car;

    @Override
    public CarBuilder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public CarBuilder setSeat(String seat) {
        this.car.setSeat(seat);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
        return this;
    }

    @Override
    public CarBuilder setGPS(String GPS) {
        this.car.setGPS(GPS);
        return this;
    }

    public Car getCar() {
        return this.car;
    }
}
