package com.zyg.staticFactory.factory;

import com.zyg.staticFactory.product.Plane;
import com.zyg.staticFactory.product.Ship;
import com.zyg.staticFactory.product.Transport;
import com.zyg.staticFactory.product.Truck;

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
