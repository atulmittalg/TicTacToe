package com.kata.tictactoe;

public class TicTacToeGame {

    final private int PLAYER_X = 1;
    final private int PLAYER_O = 2;

    private int[][] gameSet = new int[3][3];
    private int currentPlayerToken = PLAYER_X;

    public int getPlayerAtPosition(final int positionX, final int positionY) {
        return gameSet[positionX][positionY];
    }

    public void playTurnAt(final int positionX, final int positionY) {
        gameSet[positionX][positionY] = currentPlayerToken;
        if(currentPlayerToken == PLAYER_X){
            currentPlayerToken = PLAYER_O;
        }
        else {
            currentPlayerToken = PLAYER_X;
        }
    }
}