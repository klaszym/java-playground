package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(bark(true,));


    }

    public static boolean bark(boolean barking, int hourOfDay){
        if (barking && (hourOfDay >=0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)){
            return true;
        }
            return false;

    }
}
