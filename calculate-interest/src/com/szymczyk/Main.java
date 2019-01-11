package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        for (int i =8; i >0; i--){

            System.out.println(calculateInterest(10000, i));

        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*interestRate/100);
    }
}
