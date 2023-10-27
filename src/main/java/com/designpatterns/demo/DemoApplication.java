package com.designpatterns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.DataBinder;

import com.designpatterns.demo.creational.builder.Customer;
import com.designpatterns.demo.creational.builder.Loan;
import com.designpatterns.demo.creational.builder.LoanBuilder;
import com.designpatterns.demo.creational.singleton.DBProperties;
import com.designpatterns.demo.creational.singleton.DBPropertiesNew;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		// 1. Builder Pattern 

		// before design patterns
		Customer customer = new Customer("balamurugan", "Bala");
		System.out.println(customer.firstName + " " + customer.lastname);
		Customer customer1 = new Customer("bala", "bala", 22);
		System.out.println(customer1.firstName + " " + customer1.lastname + " " + customer1.age);

		Customer Customer2 = new Customer("test", "test", "test", 10);
		System.out.println(Customer2.firstName + " " + Customer2.lastname + " " + Customer2.age + " " + Customer2.middleName);



		// after design patterns

		Loan loan = new LoanBuilder().firstName("BALA").build();
		System.out.println(loan.toString());

		loan.setBranch("chennai");

		System.out.println(loan.toString());

		loan.setFirstName("balamurugan");
		loan.setCommunicationaddress("address 1");
		loan.setLoanamount(2000);
		System.out.println(loan.toString());


		// Singleton pattern 


		// before design pattern
		DBProperties prop = new DBProperties();
		System.out.println(prop.hashCode());

		DBProperties prop1= new DBProperties();
		System.out.println(prop1.hashCode());

		// after design pattern
		DBPropertiesNew prop2 = DBPropertiesNew.getConnection();
		System.out.println(prop2.hashCode());
			DBPropertiesNew prop3 = DBPropertiesNew.getConnection();
		System.out.println(prop3.hashCode());


		

	}

}
