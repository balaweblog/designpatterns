package com.designpatterns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.designpatterns.demo.creational.builder.Customer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		// before design patterns
		Customer customer = new Customer("balamurugan", "Bala");
		System.out.println(customer.firstName + " " + customer.lastname);
		Customer customer1 = new Customer("bala", "bala", 22);
		System.out.println(customer1.firstName + " " + customer1.lastname + " " + customer1.age);

		Customer Customer2 = new Customer("test", "test", "test", 10);
		System.out.println(Customer2.firstName + " " + Customer2.lastname + " " + Customer2.age + " " + Customer2.middleName);

	}

}
