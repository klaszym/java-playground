package com.szymczyk;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer() {
        this("Default name", 20000.99, "Default email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Unknown email");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}