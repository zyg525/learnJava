package com.zyg.behavioral.observer;

public class EmailAlertsListener implements Listener {
    @Override
    public void response() {
        System.out.println("邮件提醒");
    }
}
