package com.johanmha.fourinarow;

/**
 * Board that can add chips to one o its columns
 */
public class Board {
    private BoardColumn[] playingBoard = new BoardColumn[GameConstants.BOARD_COLUMNS];
    private int fullColumnCounter = 0;
    private boolean isFull = false;

    public Board() {
        for (int i = 0; i < GameConstants.BOARD_COLUMNS; i++) {
            playingBoard[i] = new BoardColumn();
        }
    }

    public int addChipToColumn(int columnNumber, Chip chip) {
        if (columnNumber >= GameConstants.BOARD_COLUMNS) {
            return -1;
        }

        BoardColumn boardColumn = playingBoard[columnNumber];
        int chipPosition = boardColumn.addChip(chip);

        if (boardColumn.isFull()) {
            ++fullColumnCounter;
            if (fullColumnCounter == GameConstants.BOARD_COLUMNS) {
                isFull = true;
            }
        }

        return chipPosition;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isColumnFull(int columnNumber) {
        return playingBoard[columnNumber].isFull();
    }

    public Chip getChip(int column, int row) {
        return playingBoard[column].getChip(row);
    }
}
