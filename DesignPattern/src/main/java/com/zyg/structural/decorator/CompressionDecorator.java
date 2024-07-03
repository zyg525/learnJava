package com.zyg.structural.decorator;

/**
 * 数据压缩装饰者
 */
public class CompressionDecorator extends DataDecorator {
    public CompressionDecorator(Data data) {
        super(data);
    }

    @Override
    public void writeData(String msg) {
        String compressionMsg = msg + "压缩";
        super.writeData(compressionMsg);
    }
}
