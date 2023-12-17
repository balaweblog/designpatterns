package com.designpatterns.demo.structural.adapter;

public class OldSystem implements IOldSystem{

    @Override
    public void doSomethingOld() {
      System.out.println("old system");
    }
}