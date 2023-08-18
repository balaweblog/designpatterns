package com.designpatterns.demo.creational.builder;

import java.time.LocalDate;

public interface ILoanBuilder {
    ILoanBuilder firstName(String firstName);
    ILoanBuilder lastName(String lastName);
    ILoanBuilder primaryEmail(String primaryEmail);
    ILoanBuilder primaryMobileNumber(String primaryMobileNumber);
    ILoanBuilder propertyaddress(String propertyaddress);
    ILoanBuilder communicationaddress(String communicationaddress);
    ILoanBuilder salary(long salary);
    ILoanBuilder employername (String employername);
    ILoanBuilder zip (String zip);
    ILoanBuilder state (String state);
    ILoanBuilder married (boolean married);
    ILoanBuilder ssnnumber (String ssnnumber);
    ILoanBuilder loanamount(double loanamount);
    ILoanBuilder tenure(int tenure);
    ILoanBuilder purposeofloan(int loanpurpose);
    ILoanBuilder dob(LocalDate dob);
    ILoanBuilder gender(char gender);
    ILoanBuilder residenttype(char residenttype);
    ILoanBuilder workexperience(int workexperience);
    ILoanBuilder branch(String branch);
    ILoanBuilder organizationtype(String organizationtype);
    ILoanBuilder projectname(String projectname);
    ILoanBuilder propertycost(Double propertycost);

}