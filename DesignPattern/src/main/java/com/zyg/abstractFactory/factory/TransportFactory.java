package com.zyg.abstractFactory.factory;


import com.zyg.abstractFactory.product.ChinaTransport;
import com.zyg.abstractFactory.product.USATransport;
import com.zyg.factoryMethod.product.Transport;

/**
 * 工厂接口
 */
public interface TransportFactory {

    ChinaTransport createChinaTransport();

    USATransport createUSATransport();
}
