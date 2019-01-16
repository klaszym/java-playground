package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPacks(1,0,4));
        System.out.println(canPacks(1,0,5));
        System.out.println(canPacks(0,5,4));
        System.out.println(canPacks(2,2,12));
        System.out.println(canPacks(-3,2,12));

    }
    public static boolean canPacks(int bigCount, int smallCout, int goal){
         if (bigCount < 0 || smallCout<0 || goal <0 || bigCount*5 + smallCout < goal) {
             return false;
         }

        return (goal % 5 >= smallCout);


    }
}
