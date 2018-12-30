package com.Aidan;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get the position " and the
        // position they got and a further message " on the high score table".

        // Create a second method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400. and 50

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Aidan", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Jimmie", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Kendrick", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Drake", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Jiffy", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Kimboslice", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Killerrrr", position);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Congratulations to player " + playerName + " for finishing in place " + position + " on the highscore table!");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score < 1000 && score >= 500) {
            return 2;
        } else if (score < 500 && score >= 100) {
            return 3;
        }

        return 4;
    }














}
