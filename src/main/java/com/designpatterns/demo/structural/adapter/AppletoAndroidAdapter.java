package com.designpatterns.demo.structural.adapter;

/* exposing the target interface while wrapping source object */
public class AppletoAndroidAdapter implements IAndroidCharger {
    private final IAppleCharger iphone;

    public AppletoAndroidAdapter(IAppleCharger iphone) {
        this.iphone = iphone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        iphone.useLightning();
    }

    @Override
    public void charge() {
        iphone.charge();
    }
}