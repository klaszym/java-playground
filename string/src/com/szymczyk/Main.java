package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more";
        System.out.println(myString);

        myString = myString + " \u00A9 2015";
        System.out.println(myString);

        String myNumber = "25.4";
        myNumber = myNumber + "43.9";
        System.out.println("myNumber is equal " + myNumber);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double myDouble = 120.88;
        lastString = lastString + myDouble;
        System.out.println(lastString);
    }
}
