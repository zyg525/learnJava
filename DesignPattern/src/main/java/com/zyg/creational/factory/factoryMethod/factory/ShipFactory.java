package com.zyg.creational.factory.factoryMethod.factory;

import com.zyg.creational.factory.factoryMethod.product.Ship;
import com.zyg.creational.factory.factoryMethod.product.Transport;

/**
 * 轮船工厂
 */
public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
