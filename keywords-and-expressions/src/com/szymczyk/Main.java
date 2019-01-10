package com.szymczyk;

public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore();


        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int result = gameOver ? 100 : 0;

        if (gameOver) {
            result = 100;
        } else {
            result = 0;
        }
    }

    public static void calculateScore() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }

}
