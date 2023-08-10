package com.designpatterns.demo.creational.builder;

public class Customer {
    public String firstName;
    public String lastname;
    public String middleName;
    public int age;

    public Customer(String firstName, String lastName, String middleName, int age) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.middleName = middleName;
        this.age = age;
    }
    
    public Customer(String firstName, String lastName, String middleName) {
        this(firstName, lastName, middleName, -1);
    }
    
    public Customer(String firstName, String lastName, int age) {
        this(firstName, lastName, null, age);
    }
    
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null, -1);
    }
}