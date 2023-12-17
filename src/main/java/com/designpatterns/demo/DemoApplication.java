package com.designpatterns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatterns.demo.creational.builder.Customer;
import com.designpatterns.demo.creational.builder.Loan;
import com.designpatterns.demo.creational.builder.LoanBuilder;
import com.designpatterns.demo.creational.singleton.DBProperties;
import com.designpatterns.demo.creational.singleton.DBPropertiesNew;

import com.designpatterns.demo.structural.adapter.OldSystem;
import com.designpatterns.demo.structural.adapter.INewSystem;
import com.designpatterns.demo.structural.adapter.NewSystem;
import com.designpatterns.demo.structural.adapter.OldSystemAdapter;
import com.designpatterns.demo.structural.adapter2.IJDBC;
import com.designpatterns.demo.structural.adapter2.IJPA;
import com.designpatterns.demo.structural.adapter2.JDBC;
import com.designpatterns.demo.structural.adapter2.JDBCAdapter;
import com.designpatterns.demo.structural.adapter2.JPA;
import com.designpatterns.demo.structural.adapter.IOldSystem;

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
		System.out.println(
				Customer2.firstName + " " + Customer2.lastname + " " + Customer2.age + " " + Customer2.middleName);

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

		DBProperties prop1 = new DBProperties();
		System.out.println(prop1.hashCode());

		// after design pattern
		DBPropertiesNew prop2 = DBPropertiesNew.getConnection();
		System.out.println(prop2.hashCode());
		DBPropertiesNew prop3 = DBPropertiesNew.getConnection();
		System.out.println(prop3.hashCode());

		// adapter design pattern

		// adapter calls

		OldSystem oldSystem = new OldSystem();
		oldSystem.doSomethingOld();

		NewSystem newSystem = new NewSystem();
		newSystem.dosomethingnew();

		//OldSystemAdapter acts as a bridge between the old and new systems, allowing the OldSystem class to work with the NewSystem interface
		OldSystemAdapter ods = new OldSystemAdapter(oldSystem);
		ods.dosomethingnew();


		IJDBC jdbc = new JDBC();
		jdbc.executeJDBCQuery("test jdbc");

		IJPA jpa = new JPA();
		jpa.executeJPAQuery("test jpa");

		JDBCAdapter jdbcjpa = new JDBCAdapter(jdbc);
		jdbcjpa.executeJPAQuery("new test jpa query");

	}

}
