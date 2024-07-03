package com.zyg.creational.factory.factoryMethod.factory;

import com.zyg.creational.factory.factoryMethod.product.Plane;
import com.zyg.creational.factory.factoryMethod.product.Transport;

/**
 * 飞机工厂
 */
public class PlaneFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
