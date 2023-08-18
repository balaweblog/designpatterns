package com.designpatterns.demo.creational.builder;

import java.time.LocalDate;

public class Loan {

    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String primaryMobileNumber;
    private String propertyaddress;
    private String communicationaddress;
    private long salary;
    private String employername;
    private String zip;
    private String state;
    private boolean married;
    private String ssnnumber;
    private double loanamount;
    private int tenure;
    private int loanpurpose;
    private LocalDate dob;
    private char gender;
    private char residenttype;
    private int workexperience;
    private String branch;
    private String organizationtype;
    private String projectname;
    private Double propertycost;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public void setPrimaryMobileNumber(String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
    }

    public String getPropertyaddress() {
        return propertyaddress;
    }

    public void setPropertyaddress(String propertyaddress) {
        this.propertyaddress = propertyaddress;
    }

    public String getCommunicationaddress() {
        return communicationaddress;
    }

    public void setCommunicationaddress(String communicationaddress) {
        this.communicationaddress = communicationaddress;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEmployername() {
        return employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getSsnnumber() {
        return ssnnumber;
    }

    public void setSsnnumber(String ssnnumber) {
        this.ssnnumber = ssnnumber;
    }

    public double getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getLoanpurpose() {
        return loanpurpose;
    }

    public void setLoanpurpose(int loanpurpose) {
        this.loanpurpose = loanpurpose;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getResidenttype() {
        return residenttype;
    }

    public void setResidenttype(char residenttype) {
        this.residenttype = residenttype;
    }

    public int getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(int workexperience) {
        this.workexperience = workexperience;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getOrganizationtype() {
        return organizationtype;
    }

    public void setOrganizationtype(String organizationtype) {
        this.organizationtype = organizationtype;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Double getPropertycost() {
        return propertycost;
    }

    public void setPropertycost(Double propertycost) {
        this.propertycost = propertycost;
    }

    public Loan(LoanBuilder loanBuilder) {
        this.firstName = loanBuilder.getFirstName();
        this.lastName = loanBuilder.getLastName();
        this.primaryEmail = loanBuilder.getPrimaryEmail();
        this.primaryMobileNumber = loanBuilder.getPrimaryMobileNumber();
        this.propertyaddress = loanBuilder.getPropertyaddress();
        this.communicationaddress = loanBuilder.getCommunicationaddress();
        this.salary = loanBuilder.getSalary();
        this.employername = loanBuilder.getEmployername();
        this.zip = loanBuilder.getZip();
        this.state = loanBuilder.getState();
        this.married = loanBuilder.isMarried();
        this.ssnnumber = loanBuilder.getSsnnumber();
        this.loanamount = loanBuilder.getLoanamount();
        this.tenure = loanBuilder.getTenure();
        this.loanpurpose = loanBuilder.getLoanpurpose();
        this.dob = loanBuilder.getDob();
        this.gender = loanBuilder.getGender();
        this.residenttype = loanBuilder.getResidenttype();
        this.workexperience = loanBuilder.getWorkexperience();
        this.branch = loanBuilder.getBranch();
        this.organizationtype = loanBuilder.getOrganizationtype();
        this.projectname = loanBuilder.getProjectname();
        this.propertycost = loanBuilder.getPropertycost();
    }

    @Override
    public String toString() {
        return "Loan [firstName=" + firstName + ", lastName=" + lastName + ", primaryEmail=" + primaryEmail
                + ", primaryMobileNumber=" + primaryMobileNumber + ", propertyaddress=" + propertyaddress
                + ", communicationaddress=" + communicationaddress + ", salary=" + salary + ", employername="
                + employername + ", zip=" + zip + ", state=" + state + ", married=" + married + ", ssnnumber="
                + ssnnumber + ", loanamount=" + loanamount + ", tenure=" + tenure + ", loanpurpose=" + loanpurpose
                + ", dob=" + dob + ", gender=" + gender + ", residenttype=" + residenttype + ", workexperience="
                + workexperience + ", branch=" + branch + ", organizationtype=" + organizationtype + ", projectname="
                + projectname + ", propertycost=" + propertycost + "]";
    }

    

}
