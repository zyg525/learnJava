package com.zyg.creational.factory.factoryMethod.factory;

import com.zyg.creational.factory.factoryMethod.product.Transport;
import com.zyg.creational.factory.factoryMethod.product.Truck;

/**
 * 卡车工厂
 */
public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
