package com.zyg.creational.factory.factoryMethod.factory;


import com.zyg.creational.factory.factoryMethod.product.Transport;

/**
 * 工厂接口
 */
public interface TransportFactory {
    Transport createTransport();
}
