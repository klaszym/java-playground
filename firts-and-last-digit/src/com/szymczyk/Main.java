package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }
    public static int sumFirstAndLastDigit(int number){

        if (number < 0) {
            return -1;
        }

        int lastNumber= number%10;
        int reverse = 0;

        while(number != 0){

           int remainder = number %10;
           reverse = reverse * 10 + remainder;
           number = number /10;
        }
        int firstNumber = reverse%10;
        int sum = firstNumber + lastNumber;
        return sum;
    }
}
