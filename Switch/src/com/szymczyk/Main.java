package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        char charvalue = 'C';

        switch (charvalue) {

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(charvalue + " was found");
                break;


            default:
                System.out.println("A, B, C, D, E was not found");
                break;

        }
    }
}
