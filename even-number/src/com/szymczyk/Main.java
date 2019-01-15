package com.szymczyk;

public class Main {

    public static void main(String[] args) {
    //     int count = 1;
    //     while (count <= 5) {
    //         System.out.println(isEvenNumber(count));
    //         count++;

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            if (count ==5){
                break;
            }
            System.out.println("Even number" + number);
         }
        System.out.println("Total number od even number is " +count);


    }

  public static boolean isEvenNumber(int n){

        if (n%2 == 0){
            return true;
        }
        return false;

    }
}
