package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }
    public static boolean hasSharedDigit(int firstNumber, int secondNumber ) {
        if ( firstNumber < 10 || secondNumber < 10 || firstNumber > 99 || secondNumber > 99) {
            return false;
        }

            int firstNumber1 = firstNumber/10;
            int firstNumber2 = firstNumber %10;
            int secondNumber1 = secondNumber/10;
            int secondNumber2 = secondNumber %10;

            return (firstNumber1 == secondNumber1 || firstNumber1 == secondNumber2 || firstNumber2 == secondNumber1 || firstNumber2 == secondNumber2);


    }
}
