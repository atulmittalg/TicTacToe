package com.kata.tictactoe;

public class TicTacToeGame {

    final private int PLAYER_X = 1;

    private int[][] gameSet = new int[3][3];
    private int currentPlayerToken = PLAYER_X;

    public int getPlayerAtPosition() {
        return currentPlayerToken;
    }
}