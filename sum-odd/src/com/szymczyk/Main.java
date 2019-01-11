package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));

    }

    public static int sumOdd(int start, int end) {
        if (isInvalidRange(start, end)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isInvalidRange(int start, int end) {
        return start > end || start <= 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}




