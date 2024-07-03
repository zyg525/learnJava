package com.zyg.structural.adapter;

public class Caller {
    public static void main(String[] args) {
        // 使用华为充电器给华为手机充电
        HuaweiCharger huaweiCharger = new HuaweiCharger();
        huaweiCharger.chargeForPhone(new Huawei());

        // 使用华为充电器给苹果手机充电
        IphoneAdapter iphoneAdapter = new IphoneAdapter(new Iphone());
        huaweiCharger.chargeForPhone(iphoneAdapter);
    }
}
