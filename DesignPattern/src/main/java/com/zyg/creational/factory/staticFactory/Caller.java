package com.zyg.creational.factory.staticFactory;

import com.zyg.creational.factory.staticFactory.factory.TransportFactory;
import com.zyg.creational.factory.staticFactory.product.Transport;

/**
 * 调用者
 */
public class Caller {

    private static String systemConfig_transportType = "plane";

    public static void main(String[] args) {
        Transport transport = TransportFactory.createTransport(systemConfig_transportType);
        transport.deliver();
    }
}
