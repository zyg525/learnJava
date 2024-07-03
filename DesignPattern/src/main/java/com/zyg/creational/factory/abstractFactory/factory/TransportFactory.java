package com.zyg.creational.factory.abstractFactory.factory;


import com.zyg.creational.factory.abstractFactory.product.ChinaTransport;
import com.zyg.creational.factory.abstractFactory.product.USATransport;

/**
 * 工厂接口
 */
public interface TransportFactory {

    ChinaTransport createChinaTransport();

    USATransport createUSATransport();
}
