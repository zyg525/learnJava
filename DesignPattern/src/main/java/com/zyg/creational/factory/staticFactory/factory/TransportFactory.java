package com.zyg.creational.factory.staticFactory.factory;

import com.zyg.creational.factory.staticFactory.product.Plane;
import com.zyg.creational.factory.staticFactory.product.Ship;
import com.zyg.creational.factory.staticFactory.product.Transport;
import com.zyg.creational.factory.staticFactory.product.Truck;

/**
 * 静态工厂
 */
public class TransportFactory {

    public static Transport createTransport(String transportType) {
        if("truck".equals(transportType)) {
            return new Truck();
        } else if ("ship".equals(transportType)) {
            return new Ship();
        } else if ("plane".equals(transportType)) {
            return new Plane();
        }
        return null;
    }
}
