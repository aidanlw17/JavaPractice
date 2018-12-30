package com.Aidan;

/**
 * Created by Aidan on 2017-07-07.
 */
public class BankAccount {

    private int number;
    private double balance;
    private int phoneNumber;
    private String customerName;
    private String email;

    public BankAccount() {
        this(56789, 2500, 0000, "Default Name", "Default address");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, int phoneNumber, String customerName, String email) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(int phoneNumber, String customerName, String email) {
        this(99999, 100.55, phoneNumber, customerName, email);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return this.number;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amountDeposited) {
        this.balance += amountDeposited;
        System.out.println("Deposit of " + amountDeposited + " made. New balance is " + this.balance);
    }

    public void withdraw(double amountWithdraw) {
        if(amountWithdraw <= this.balance) {
            this.balance -= amountWithdraw;
            System.out.println("Withdraw of " + amountWithdraw + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Error, insufficient funds. Only " + this.balance + " available");
        }
    }

}
