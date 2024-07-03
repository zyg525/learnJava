package com.zyg.structural.decorator;

/**
 * 被装饰类
 */
public class FileData implements Data {

    /**
     * 被装饰类中定义了最基础、最核心的业务逻辑
     * @param msg
     */
    @Override
    public void writeData(String msg) {
        System.out.println("向磁盘写入数据：" + msg);
    }
}
