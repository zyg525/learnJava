package com.zyg.creational.factory.abstractFactory.factory;

import com.zyg.creational.factory.abstractFactory.product.USAPlane;
import com.zyg.creational.factory.abstractFactory.product.ChinaPlane;
import com.zyg.creational.factory.abstractFactory.product.ChinaTransport;
import com.zyg.creational.factory.abstractFactory.product.USATransport;

public class PlaneFactory implements TransportFactory {
    @Override
    public ChinaTransport createChinaTransport() {
        return new ChinaPlane();
    }

    @Override
    public USATransport createUSATransport() {
        return new USAPlane();
    }
}
