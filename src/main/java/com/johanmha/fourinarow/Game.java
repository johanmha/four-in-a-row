package com.johanmha.fourinarow;

import com.johanmha.fourinarow.enums.ChipColor;

/**
 * Game holds the players and their respective bitmap of the board + the game board. Can place chip.
 * It is the responsibility of the user of the game to check the result
 */
public class Game {

    private Board playingBoard = new Board();
    private Player[] players = new Player[2];
    private Bitmap[] playerBitMaps = new Bitmap[2];
    private int gameResult = -1;

    private int currentPlayer = 0;

    public Game() {
        players[0] = new Player(ChipColor.RED, playingBoard);
        players[1] = new Player(ChipColor.YELLOW, playingBoard);

        playerBitMaps[0] = new Bitmap();
        playerBitMaps[1] = new Bitmap();
    }

    /**
     * Play chip for the current player
     * 
     * @param column - which column to place chip in
     * @return row - position of chip in column
     */
    public int placeChip(int column) {
        if (gameResult != -1) {
            return -1;
        }

        int row = players[currentPlayer].addChip(column);

        if (row != -1) {
            boolean winFound = playerBitMaps[currentPlayer].addChipToBitmap(column, row);

            if (winFound) {
                gameResult = currentPlayer;
            }

            if (playingBoard.isFull() && gameResult == -1) {
                gameResult = 2;
            }

            nextPlayer();
        }

        return row;
    }

    public int getGameResult() {
        return gameResult;
    }

    public boolean isColumnFull(int column) {
        return playingBoard.isColumnFull(column);
    }

    private void nextPlayer() {
        currentPlayer = 1 - currentPlayer;
    }

    public Chip getChip(int column, int row) {
        return playingBoard.getChip(column, row);
    }
}
