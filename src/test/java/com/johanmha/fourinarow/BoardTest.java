package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.johanmha.fourinarow.enums.ChipColor;

class BoardTest {

    @Test
    void createBoard() {
        Board playingBoard = new Board();
        assertEquals(false, playingBoard.isFull());
        assertEquals(false, playingBoard.isColumnFull(GameConstants.BOARD_COLUMNS - 1));
    }

    @Test
    void addChips() {
        Board playingBoard = new Board();
        int firstChipPosition = playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        int nullChipPosition = playingBoard.addChipToColumn(2, null);

        assertEquals(0, firstChipPosition);
        assertEquals(-1, nullChipPosition);
        assertEquals(false, playingBoard.isColumnFull(2));

        playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        int lastChipPosition = playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));

        assertEquals(5, lastChipPosition);
        assertEquals(true, playingBoard.isColumnFull(2));

        int overflowChipAdd = playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        assertEquals(-1, overflowChipAdd);

    }

    @Test
    void fillBoard() {
        Board playingBoard = new Board();

        for (int i = 0; i < GameConstants.BOARD_COLUMNS; i++) {
            for (int j = 0; j < GameConstants.BOARD_ROWS; j++) {
                playingBoard.addChipToColumn(i, new Chip(ChipColor.YELLOW));
            }
        }

        assertEquals(true, playingBoard.isFull());
    }

    @Test
    void getChip() {
        Board playingBoard = new Board();

        playingBoard.addChipToColumn(2, new Chip(ChipColor.RED));
        playingBoard.addChipToColumn(2, new Chip(ChipColor.YELLOW));

        assertEquals(ChipColor.RED, playingBoard.getChip(2, 0).getColor());
        assertEquals(ChipColor.YELLOW, playingBoard.getChip(2, 1).getColor());
    }
}
