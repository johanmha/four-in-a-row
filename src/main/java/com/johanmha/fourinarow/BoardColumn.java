package com.johanmha.fourinarow;

/**
 * BoardColum that can add Chip to it self.
 */
public class BoardColumn {
    private Chip[] column = new Chip[GameConstants.BOARD_ROWS];
    private boolean isFull = false;

    public int addChip(Chip chip) {
        if (isFull || chip == null) {
            return -1;
        }

        for (int i = 0; i < column.length; i++) {
            if (column[i] == null) {
                column[i] = chip;
                if (i == 5) {
                    setIsFull();
                }

                return i;
            }
        }

        return -1;
    }

    private void setIsFull() {
        isFull = true;
    }

    public boolean isFull() {
        return isFull;
    }
}
