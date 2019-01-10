package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualToThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualToThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualToThreeDecimalPlaces(3.0, 3.0));

    }
    public static boolean areEqualToThreeDecimalPlaces(double firstNumber, double secondNumber){

        firstNumber = (int) (firstNumber * 1000);
        secondNumber = (int) (secondNumber * 1000);

        if (firstNumber == secondNumber){
            return true;
        } else {
            return false;
        }
    }
}
