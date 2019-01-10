package com.szymczyk;

public class Main {

    private static final String invalidValueMassage = "Invalid Value";

    public static void main(String[] args) {
        String duration = getDurationString(65, 45);
        display(duration);

        display(getDurationString(3945L));
        display(getDurationString(-5, 2));

    }

    public static void display(String toDisplay) {
        System.out.println("!!!%%%####$!!!");
        System.out.println(toDisplay);
        System.out.println("!!!%%%####$!!!");
    }

    public static String getDurationString(long second){

        if (second < 0){
            return invalidValueMassage;
        }
        long minute = second / 60;
        long remainingSeconds = second % 60;

        return getDurationString(minute, remainingSeconds);

    }

    public static String getDurationString(long minute, long second){

        if ((minute < 0) || (second < 0) || (second > 59)){
            return invalidValueMassage;
        }

        long hour = minute / 60;
        long remainingMinute = minute % 12;

        String hoursString = hour + "h";
        if (hour< 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinute + "m";
        if (remainingMinute < 10) {
            minutesString = "0" + minutesString;
        }

        String secondString = second + "s";
        if (second < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + " " + minutesString + " " + secondString;
    }
}
