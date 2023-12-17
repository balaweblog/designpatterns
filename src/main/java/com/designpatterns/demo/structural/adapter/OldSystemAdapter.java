package com.designpatterns.demo.structural.adapter;

public class OldSystemAdapter implements INewSystem {
    private IOldSystem oldsystem;


    public OldSystemAdapter(OldSystem oldSystem) {
        this.oldsystem = oldSystem;
    }

    @Override
    public void dosomethingnew() {
       oldsystem.doSomethingOld();
    }
}