package com.designpatterns.demo.creational.singleton;

public class DBPropertiesNew {
    private static DBPropertiesNew connection = null;

    private DBPropertiesNew() {}

    synchronized public static DBPropertiesNew getConnection() {
        if (connection == null) {
            connection = new DBPropertiesNew();
        }

        return connection;
    }
}
