package com.zyg.structural.decorator;

public class Caller {
    public static void main(String[] args) {
        DataDecorator dataDecorator = new CompressionDecorator(new EncryptionDecorator(new FileData()));
        dataDecorator.writeData("你好");
    }
}
