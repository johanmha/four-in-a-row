package com.johanmha.fourinarow;

public class Board {
    private int columns = 7;
    private BoardColumn[] playingBoard = new BoardColumn[columns];
    private int fullColumnCounter = 0;
    private boolean isFull = false;

    public Board() {
        for (int i = 0; i < columns; i++) {
            playingBoard[i] = new BoardColumn();
        }
    }

    public int addChipToColumn(int columnNumber, Chip chip) {
        BoardColumn boardColumn = playingBoard[columnNumber];
        int chipPosition = boardColumn.addChip(chip);

        if (boardColumn.isFull()) {
            ++fullColumnCounter;
            if (fullColumnCounter == columns) {
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
}
