package com.designpatterns.demo.structural.adapter2;

public class JDBC implements IJDBC{

    @Override
    public void executeJDBCQuery(String jdbcquery) {
        System.out.println("Executing JDBC query: " + jdbcquery);

    }
    
}
