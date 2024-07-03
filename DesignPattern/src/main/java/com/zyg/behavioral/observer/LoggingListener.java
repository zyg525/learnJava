package com.zyg.behavioral.observer;

public class LoggingListener implements Listener {
    @Override
    public void response() {
        System.out.println("记录日志");
    }
}
