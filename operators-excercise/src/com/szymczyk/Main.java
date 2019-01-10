package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        double firstNumber = 20d;
        double secondNumber = 80d;

        double myTotal = (firstNumber + secondNumber) * 25;
        System.out.println("myTotal is equal to " + myTotal);
        double myRemainder = myTotal % 40;
        System.out.println("myRemainder is equal to " +myRemainder);
        if (myRemainder <= 20)
            System.out.println("Total is over the limit");


    }
}
