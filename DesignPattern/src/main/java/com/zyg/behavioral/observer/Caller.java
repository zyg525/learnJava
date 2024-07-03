package com.zyg.behavioral.observer;

public class Caller {
    public static void main(String[] args) {
        // 创建消费者
        LoggingListener loggingListener = new LoggingListener();
        EmailAlertsListener emailAlertsListener = new EmailAlertsListener();

        // 让消费者订阅生产者
        EventManager eventManager = new EventManager();
        eventManager.subscribe(loggingListener)
                    .subscribe(emailAlertsListener);

        // 生产者执行方法，通知所有消费者
        Editor editor = new Editor(eventManager);
        editor.openFile();
    }
}
