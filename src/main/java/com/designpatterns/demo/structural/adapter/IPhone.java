package com.designpatterns.demo.structural.adapter;

public class IPhone implements IAppleCharger {

    @Override
    public void useLightning() {
        System.out.println("Lightning connected");
    }

    @Override
    public void charge() {
        System.out.println("Charge started");
    }
}