package com.johanmha.fourinarow;

import com.johanmha.fourinarow.enums.ChipColor;

/**
 * Game holds the players and board.
 */
public class Game {

    private Board playingBoard = new Board();
    private Player[] players = new Player[2];
    private int currentPlayer = 0;

    public Game() {
        players[0] = new Player(ChipColor.RED, playingBoard);
        players[1] = new Player(ChipColor.YELLOW, playingBoard);
    }

    /**
     * Play chip for the current player
     * 
     * @param column
     * @return position of chip in column
     */
    public int playChip(int column) {
        int chipPosition = players[currentPlayer].addChip(column);
        nextPlayer();

        return chipPosition;
    }

    public boolean isBoardFull() {
        return playingBoard.isFull();
    }

    public boolean isColumnFull(int column) {
        return playingBoard.isColumnFull(column);
    }

    private void nextPlayer() {
        currentPlayer = 1 - currentPlayer;
    }

}
