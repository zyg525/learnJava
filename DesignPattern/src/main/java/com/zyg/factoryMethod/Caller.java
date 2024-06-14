package com.zyg.factoryMethod;

import com.zyg.factoryMethod.factory.PlaneFactory;
import com.zyg.factoryMethod.factory.ShipFactory;
import com.zyg.factoryMethod.factory.TransportFactory;
import com.zyg.factoryMethod.factory.TruckFactory;
import com.zyg.factoryMethod.product.Transport;

public class Caller {

    /**
     * 系统配置中声明的运输类型
     */
    private static String systemConfig_transportType = "plane";

    private static TransportFactory transportFactory;

    /**
     * 在初始化系统的过程中，确定工厂的实际类型
     */
    private static void initSystem() {
        if("truck".equals(systemConfig_transportType)) {
            transportFactory = new TruckFactory();
        } else if ("ship".equals(systemConfig_transportType)) {
            transportFactory = new ShipFactory();
        } else if ("plane".equals(systemConfig_transportType)) {
            transportFactory = new PlaneFactory();
        }
    }

    public static void main(String[] args) {
        initSystem();

        Transport transport = transportFactory.createTransport();
        transport.deliver();
    }
}
