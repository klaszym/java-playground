package com.szymczyk;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
    }
    public static int reverse (int number){
        int reverseNumber = 0;
        int lastDigit;
        while(number != 0){
            lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int reversedNumber = reverse(number);
            int digitsCount = getDigitCount(number);
            int lastDigit;
            String printDigit = "";

            while (digitsCount != 0) {
                lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        printDigit = "Zero ";
                        break;
                    case 1:
                        printDigit = "One ";
                        break;
                    case 2:
                        printDigit = "Two ";
                        break;
                    case 3:
                        printDigit = "Three ";
                        break;
                    case 4:
                        printDigit = "Four ";
                        break;
                    case 5:
                        printDigit = "Five ";
                        break;
                    case 6:
                        printDigit = "Six ";
                        break;
                    case 7:
                        printDigit = "Seven ";
                        break;
                    case 8:
                        printDigit = "Eight ";
                        break;
                    case 9:
                        printDigit = "Nine ";
                        break;
                }
                System.out.print(printDigit);
                reversedNumber /= 10;
                digitsCount--;
            }

    }


    }
}
