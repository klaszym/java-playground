package com.szymczyk;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        fibonacci(4);
    }

    public static void fibonacci(int n) {
        int first = 1;
        int second = 1;
        int sum=0;


        for (int i = 0; i < (n); i++) {
            if (i == 0 || i == 1) {
                System.out.println(1);

            } else {
                int third = first + second;
                first = second;
                second = third;
                sum+=third;
                System.out.println(sum);
            }

        }

    }
}

/**
 * Napisz metodę która zwróci n pierwszych liczb ciągu fibonnaci, gdzie n to podana dowolna liczba naturalna.
 */

/**
 * Napisz metodę wyświetli n pierwszych liczb ciągu fibonnaci, gdzie n to dowolna liczba naturalna.
 */


/**
 * Tablice
 *
 * int[] fibo = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]
 * fibo[5] + fibo[7] = 8 + 21 = 29
 *
 *
 */
