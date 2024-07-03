package com.zyg.creational.factory.abstractFactory;


import com.zyg.creational.factory.abstractFactory.factory.PlaneFactory;
import com.zyg.creational.factory.abstractFactory.factory.ShipFactory;
import com.zyg.creational.factory.abstractFactory.factory.TransportFactory;
import com.zyg.creational.factory.abstractFactory.factory.TruckFactory;
import com.zyg.creational.factory.abstractFactory.product.ChinaTransport;

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

        ChinaTransport chinaTransport = transportFactory.createChinaTransport();
        chinaTransport.deliver();
    }
}
