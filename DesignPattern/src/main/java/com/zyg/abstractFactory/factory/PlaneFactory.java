package com.zyg.abstractFactory.factory;

import com.zyg.abstractFactory.product.*;

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
