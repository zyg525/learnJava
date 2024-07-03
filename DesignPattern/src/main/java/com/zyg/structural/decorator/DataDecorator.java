package com.zyg.structural.decorator;

/**
 * 装饰者基类
 */
public class DataDecorator implements Data {

    private Data data;

    public DataDecorator(Data data) {
        this.data = data;
    }

    /**
     * 把一切行为委托给被装饰类Data
     * @param msg
     */
    @Override
    public void writeData(String msg) {
        data.writeData(msg);
    }
}
