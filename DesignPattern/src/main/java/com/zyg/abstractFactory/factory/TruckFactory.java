package com.zyg.abstractFactory.factory;

import com.zyg.abstractFactory.product.ChinaTransport;
import com.zyg.abstractFactory.product.ChinaTruck;
import com.zyg.abstractFactory.product.USATransport;
import com.zyg.abstractFactory.product.USATruck;

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
