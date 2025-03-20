package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.johanmha.fourinarow.enums.ChipColor;

class BoardColumnTest {
    @Test
    void boardColumnCreation() {
        BoardColumn column = new BoardColumn();
        assertEquals(false, column.isFull());
    }

    @Test
    void addNullChipTest() {
        BoardColumn boardColumn = new BoardColumn();

        int illegalAdd = boardColumn.addChip(null);

        assertEquals(-1, illegalAdd);
    }

    @Test
    void addToFullRow() {
        BoardColumn boardColumn = new BoardColumn();
        Chip chip = new Chip(ChipColor.YELLOW);

        int firstChipPosition = boardColumn.addChip(chip);
        boardColumn.addChip(chip);
        boardColumn.addChip(chip);
        boardColumn.addChip(chip);
        boardColumn.addChip(chip);
        int finalChipPosition = boardColumn.addChip(chip);


        assertEquals(0, firstChipPosition);
        assertEquals(5, finalChipPosition);
        assertEquals(true, boardColumn.isFull());

        int addWhenFull = boardColumn.addChip(chip);

        assertEquals(-1, addWhenFull);
        assertEquals(true, boardColumn.isFull());
    }
}
