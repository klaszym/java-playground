package com.szymczyk;

public class Main {

    public static void main(String[] args) {

        int HighScorePosition = calculateHighScorePosition(1500);
        displayHihgScorePosition("Tim", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHihgScorePosition("Bob", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHihgScorePosition("Percy", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHihgScorePosition("Jan", HighScorePosition);

    }

    public static int calculateHighScorePosition(int playerScore){

  //      if (playerScore >= 1000) {
  //          return 1;
  //      } else if (playerScore >= 500) {
  //          return 2;
  //      } else if ( playerScore >= 100) {
  //          return 3;
  //      }
  //      return 4;

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if ( playerScore >= 100) {
            position = 3;
        }
        return position;

    }

    public static void displayHihgScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " manage to get a position " + highScorePosition + " on the high score table." );
    }
}
