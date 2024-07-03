package com.zyg.creational.factory.abstractFactory.factory;

import com.zyg.creational.factory.abstractFactory.product.USATruck;
import com.zyg.creational.factory.abstractFactory.product.ChinaTransport;
import com.zyg.creational.factory.abstractFactory.product.ChinaTruck;
import com.zyg.creational.factory.abstractFactory.product.USATransport;

public class TruckFactory implements TransportFactory {
    @Override
    public ChinaTransport createChinaTransport() {
        return new ChinaTruck();
    }

    @Override
    public USATransport createUSATransport() {
        return new USATruck();
    }
}
