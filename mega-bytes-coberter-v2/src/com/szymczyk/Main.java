package com.szymczyk;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

            printMegaBytesAndKiloBytes(2050);

        }

        public static void printMegaBytesAndKiloBytes (int kilobytes) {

            int XX;
            int YY;
            int ZZ;

            if (kilobytes >0) {
                XX = kilobytes;
                YY = XX/1024;
                ZZ= XX%1024;

                System.out.println(XX + " KB = " + YY+ " MB and " + ZZ + " KB ");

            } else if (kilobytes < 0) {
                System.out.println("Invalid volue");
            } else if (kilobytes == 0) {
                System.out.println("0 KB = 0 MB and 0 KB");
            }

        }
}
