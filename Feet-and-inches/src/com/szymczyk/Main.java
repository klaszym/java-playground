package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(-100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feed or inches parameters");
            return -1;
        }

       double centimeters = (feet *12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " +centimeters + " centimeters ");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches < 0){
            System.out.println("Invalid inches parameters");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet +" feet and "+ remainingInches + " remaining ");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }
}

