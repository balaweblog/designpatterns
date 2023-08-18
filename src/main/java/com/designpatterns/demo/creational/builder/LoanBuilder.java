package com.designpatterns.demo.creational.builder;

import java.time.LocalDate;

public class LoanBuilder implements ILoanBuilder {
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

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
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

    @Override
    public ILoanBuilder branch(String branch) {
        this.branch = branch;
        return null;
    }

    @Override
    public ILoanBuilder communicationaddress(String communicationaddress) {
        this.communicationaddress = communicationaddress;
        return null;
    }

    @Override
    public ILoanBuilder dob(LocalDate dob) {
        this.dob = dob;
        return null;
    }

    @Override
    public ILoanBuilder employername(String employername) {
        this.employername = employername;
        return null;
    }

    @Override
    public ILoanBuilder gender(char gender) {
        this.gender = gender;
        return null;
    }

    @Override
    public ILoanBuilder loanamount(double loanamount) {
        this.loanamount = loanamount;
        return null;
    }

    @Override
    public ILoanBuilder married(boolean married) {
        this.married = married;
        return null;
    }

    @Override
    public ILoanBuilder organizationtype(String organizationtype) {
        this.organizationtype = organizationtype;
        return null;
    }

    @Override
    public ILoanBuilder projectname(String projectname) {
        this.projectname = projectname;
        return null;
    }

    @Override
    public ILoanBuilder propertyaddress(String propertyaddress) {
        this.propertyaddress = propertyaddress;
        return null;
    }

    @Override
    public ILoanBuilder propertycost(Double propertycost) {
        this.propertycost = propertycost;
        return null;
    }

    @Override
    public ILoanBuilder purposeofloan(int loanpurpose) {
        this.loanpurpose = loanpurpose;
        return null;
    }

    @Override
    public ILoanBuilder residenttype(char residenttype) {
        this.residenttype = residenttype;
        return null;
    }

    @Override
    public ILoanBuilder salary(long salary) {
        this.salary = salary;
        return null;
    }

    @Override
    public ILoanBuilder ssnnumber(String ssnnumber) {
        this.ssnnumber = ssnnumber;
        return null;
    }

    @Override
    public ILoanBuilder state(String state) {
        this.state = state;
        return null;
    }

    @Override
    public ILoanBuilder tenure(int tenure) {
        this.tenure = tenure;
        return null;
    }

    @Override
    public ILoanBuilder workexperience(int workexperience) {
        this.workexperience = workexperience;
        return null;
    }

    @Override
    public ILoanBuilder zip(String zip) {
        this.zip = zip;
        return null;
    }

    @Override
    public LoanBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public LoanBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public LoanBuilder primaryEmail(final String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public LoanBuilder primaryMobileNumber(final String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    public Loan build() {
        return new Loan(this);
    }
}
