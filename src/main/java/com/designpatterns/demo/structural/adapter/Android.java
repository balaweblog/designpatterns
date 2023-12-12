package com.designpatterns.demo.structural.adapter;

public class Android implements IAndroidCharger {

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
    }

    @Override
    public void charge() {
        System.out.println("charge started");
    }
}