package com.zyg.factoryMethod.factory;

import com.zyg.factoryMethod.product.Ship;
import com.zyg.factoryMethod.product.Transport;
import com.zyg.factoryMethod.product.Truck;

/**
 * 轮船工厂
 */
public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
