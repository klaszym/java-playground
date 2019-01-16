package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatesCommonDivisor(25,15));
    }
    public static int getGreatesCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;

        }

        if (first > second) {

            for (int i = second; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;
                }
            }
        } else if (second > first) {
            for (int i = first; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    return i;

                }

            }

        }
        return -1;
    }
}
