package com.Aidan;

public class Main {

    public static void main(String[] args) {
	    // Create a new class for a bank account
        // Create new fields for account number, balance, customer name, email, and phone number
        //
        // Create getters and setters for each field
        // Create two additional methods for each field
        // 1. To allow the customer to deposit funds (this should increment the balance field)
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdraw to complete if there are insufficient funds
        // You will want to create various code in th Main class (intelliJ created) to
        // confirm your code is working
        // Add some system.out.println's in the two methods above as well.

//        BankAccount aidansAccount = new BankAccount(); //12345, 0.00, 613929,
//               // "Aidan", "aidan.lw17@gmail.com");
//        System.out.println(aidansAccount.getNumber());
//        System.out.println(aidansAccount.getBalance());
//        aidansAccount.getNumber();
//
//
//        aidansAccount.withdraw(100.0);
//
//        aidansAccount.deposit(50.0);
//        aidansAccount.withdraw(100.0);
//
//        aidansAccount.deposit(51.0);
//        aidansAccount.withdraw(100.0);
//
//        BankAccount otherAccount = new BankAccount(613548, "Aidan2", "angrynoodle17@gmail.com");
//        System.out.println(otherAccount.getNumber() + " name is " + otherAccount.getCustomerName());

        // Create a new class VipCustomer
        // It should have three fields name, credit limit, email address
        // create 3 constructors
        // 1st constructor empty should call the three parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the third
        // 3rd constructor should save all fields
        // create getters only for this using code generation by intelliJ as setters will not be needed
        // test and confirm it works

        VipCustomer newVip = new VipCustomer();
        System.out.println(newVip.getEmailAddress());

        VipCustomer aidansVIP = new VipCustomer("Yung Blood", 10000000.0, "sav@yung.com");
        System.out.println(aidansVIP.getEmailAddress());

        VipCustomer otherVip = new VipCustomer("Other", 374000);
        System.out.println(otherVip.getEmailAddress());
    }
}
