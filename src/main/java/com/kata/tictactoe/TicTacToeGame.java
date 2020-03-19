package com.kata.tictactoe;

public class TicTacToeGame {

    final private int PLAYER_X = 1;
    final private int PLAYER_O = 2;
    final private int EMPTY_POSITION = 0;

    private int[][] gameSet = new int[3][3];
    private int currentPlayerToken = PLAYER_X;

    public int getPlayerAtPosition(final int positionX, final int positionY) {
        return gameSet[positionX][positionY];
    }

    public void playTurnAt(final int positionX, final int positionY) {
        if(gameSet[positionX][positionY] != EMPTY_POSITION){ throw new RuntimeException("Space already filled!");}
        gameSet[positionX][positionY] = currentPlayerToken;
        changePlayerForNextTurn();
    }

    private void changePlayerForNextTurn() {
        currentPlayerToken = (currentPlayerToken == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }
}