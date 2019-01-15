package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int orginal = number;


        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return orginal == reverse;
    }



}
