package com.zyg.creational.factory.abstractFactory.factory;

import com.zyg.creational.factory.abstractFactory.product.USAShip;
import com.zyg.creational.factory.abstractFactory.product.ChinaShip;
import com.zyg.creational.factory.abstractFactory.product.ChinaTransport;
import com.zyg.creational.factory.abstractFactory.product.USATransport;

public class ShipFactory implements TransportFactory {
    @Override
    public ChinaTransport createChinaTransport() {
        return new ChinaShip();
    }

    @Override
    public USATransport createUSATransport() {
        return new USAShip();
    }
}
