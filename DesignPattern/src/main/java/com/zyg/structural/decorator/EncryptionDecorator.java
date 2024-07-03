package com.zyg.structural.decorator;

/**
 * 数据加密装饰者
 */
public class EncryptionDecorator extends DataDecorator {
    public EncryptionDecorator(Data data) {
        super(data);
    }

    @Override
    public void writeData(String msg) {
        // 在委托给被装饰类之前或之后，执行装饰者自己的业务逻辑
        String encryptionMsg = msg + "加密";
        super.writeData(encryptionMsg);
    }
}
