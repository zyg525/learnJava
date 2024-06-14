package com.zyg.factoryMethod.factory;

import com.zyg.factoryMethod.product.Plane;
import com.zyg.factoryMethod.product.Transport;
import com.zyg.factoryMethod.product.Truck;

/**
 * 飞机工厂
 */
public class PlaneFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
