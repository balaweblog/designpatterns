package com.designpatterns.demo.structural.adapter;

public class NewSystem implements INewSystem{

    @Override
    public void dosomethingnew() {
        System.out.println("new system");
    }
}