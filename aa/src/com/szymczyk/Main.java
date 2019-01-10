package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        int age = Integer.valueOf(args[0]);
        boolean teenager = TeenNumberChecker.isTeenager(age);

        System.out.println("Given number is teenager: " +teenager);

    }
}
