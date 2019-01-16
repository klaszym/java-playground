package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(11));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(7));

    }
    public static int getLargestPrime(int number){
        if (number <=1){
            return -1;
        }
        for (int i = number; i > 1; i--){
            if (number % i == 0 && number/i != 1) {
                number = i;
            }
        }
        return number;
    }
}
