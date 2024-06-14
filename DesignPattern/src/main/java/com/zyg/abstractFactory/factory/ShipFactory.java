package com.zyg.abstractFactory.factory;

import com.zyg.abstractFactory.product.*;

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
