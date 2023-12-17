package com.designpatterns.demo.structural.adapter2;

public class JPA implements IJPA{

    @Override
    public void executeJPAQuery(String jpaquery) {
        System.out.println("Executing JPA query: " + jpaquery);

    }
    
}
