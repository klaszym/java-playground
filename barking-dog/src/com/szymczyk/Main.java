package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        System.out.println(bark(true,5));

	 }
	 public static boolean bark(boolean barking, int hourOfDay){



        if (barking = true && hourOfDay < 8 && hourOfDay > 0){
            return true;
        }else  if (barking = true && hourOfDay >22 && hourOfDay <= 23){
            return true;
        }
        return false;

     }
}
