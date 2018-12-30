package com.Aidan;

/**
 * Created by Aidan on 2017-07-09.
 */
public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("Name unknown", 30000.0, "Address unknown");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@rbc.ca");
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerName() {

        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
