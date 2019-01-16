package com.szymczyk;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = 1;
        int sum=0;

        while (x <=10){

            System.out.println("Enter number #"+ x);
            boolean hasNextInt = scanner.hasNextInt();
            x++;

            if(hasNextInt) {
                int number = scanner.nextInt();
                sum+=number;


            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();
        }
        System.out.println("Your sum is: " + sum);
        scanner.close();

    }
}
