package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-2050);

    }

    public static void printMegaBytesAndKiloBytes (int kilobytes) {

        int converter = 1024;
        int MegaBytes = kilobytes/converter;
        int remainderKiloBytes = kilobytes % converter;

        if (kilobytes >= 0) {

            System.out.println(kilobytes + " KB = " + MegaBytes + " MB " + remainderKiloBytes + " KB ");
        } else if (kilobytes < 0 ) {
            System.out.println("Invalid volue");
        }





    }

}
