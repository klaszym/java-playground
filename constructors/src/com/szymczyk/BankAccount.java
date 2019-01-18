package com.szymczyk;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phonenumber;

    public BankAccount(){
        this("8888", 2.50, "Default name", "Default email", "Default phonenumber");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phonenumber){
        System.out.println("Account constructor with parameters called ");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public BankAccount(String customerName, String email, String phonenumber) {
        this("999", 100.55, customerName, email, phonenumber);

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount +" made. New balance is "+this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount <= 0){
            System.out.println("Only "+ this.balance + "available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount+ " processed. Remaining balance = " +this.balance);
        }


    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}


