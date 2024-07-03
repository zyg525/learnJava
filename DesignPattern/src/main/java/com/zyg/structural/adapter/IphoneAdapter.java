package com.zyg.structural.adapter;

// 华为-苹果 充电适配器
public class IphoneAdapter extends Huawei {

    private Iphone iphone;

    public IphoneAdapter(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void charge() {
        iphone.charge();
    }
}
