package com.johanmha.fourinarow;

import com.johanmha.fourinarow.enums.ChipColor;

/**
 * Player that can play in a game of four in a row. Takes a ChipColor of red and yellow as input
 * which is its color for the rest of the game. Can add a chip to a board.
 */
public class Player {
    private final ChipColor playerColor;
    private Board playingBoard;

    public Player(ChipColor playerColor, Board playingBoard) {
        this.playerColor = playerColor;
        this.playingBoard = playingBoard;
    }

    public int addChip(int column) {
        return playingBoard.addChipToColumn(column, new Chip(playerColor));
    }
}
