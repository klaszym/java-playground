package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));

    }

    public static boolean isLeapYear(int year){

        if (year < 0 && year > 99999){
             return false;
         } else if ((year % 4 == 0) && (year%100 != 0) || (year % 400 == 0)){
             return true;
         } else {
             return false;
         }

    }

    public static int getDaysInMonth(int month, int year){


        if (month < 1 || month > 12 || year <1 || year > 9999){
            return -1;

        } else {
            switch (month) {


                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                default:
                    return 31;
            }
        }


    }
}
