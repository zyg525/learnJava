package com.zyg.factoryMethod.factory;

import com.zyg.factoryMethod.product.Transport;
import com.zyg.factoryMethod.product.Truck;

/**
 * 卡车工厂
 */
public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
