package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BitmapTest {

    @Test
    void addChipsToBitmap() {
        Bitmap gameBitmap = new Bitmap();

        gameBitmap.addChipToBitmap(1, 0);
        gameBitmap.addChipToBitmap(1, 1);
        gameBitmap.addChipToBitmap(0, 0);

        // expected bitmap: 110000001 = 385
        assertEquals(385L, gameBitmap.getGameBitmap());
        assertEquals("110000001", Long.toBinaryString(gameBitmap.getGameBitmap()));
    }

    @Test
    void checkWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.isWin());
    }
}

