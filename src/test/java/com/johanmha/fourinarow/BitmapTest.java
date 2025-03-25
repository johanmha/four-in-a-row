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
        assertEquals(false, gameBitmap.addChipToBitmap(3, 3));
    }

    @Test
    void checkHorisontalWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(6, 0));
        assertEquals(false, gameBitmap.addChipToBitmap(6, 1));
        assertEquals(false, gameBitmap.addChipToBitmap(6, 2));
        assertEquals(true, gameBitmap.addChipToBitmap(6, 3));
    }

    @Test
    void checkFalseHorisontalWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(6, 0));
        assertEquals(false, gameBitmap.addChipToBitmap(6, 1));
        assertEquals(false, gameBitmap.addChipToBitmap(6, 4));
        assertEquals(false, gameBitmap.addChipToBitmap(6, 5));
    }

    @Test
    void checkVerticalWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(6, 4));
        assertEquals(false, gameBitmap.addChipToBitmap(5, 4));
        assertEquals(false, gameBitmap.addChipToBitmap(4, 4));
        assertEquals(true, gameBitmap.addChipToBitmap(3, 4));
    }

    @Test
    void checkdiagonalUpWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(0, 1));
        assertEquals(false, gameBitmap.addChipToBitmap(1, 2));
        assertEquals(false, gameBitmap.addChipToBitmap(2, 3));
        assertEquals(true, gameBitmap.addChipToBitmap(3, 4));
    }

    @Test
    void checkFalseDiagonalUpWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(0, 4));
        assertEquals(false, gameBitmap.addChipToBitmap(1, 5));
        assertEquals(false, gameBitmap.addChipToBitmap(2, 0));
        assertEquals(false, gameBitmap.addChipToBitmap(3, 1));
    }


    @Test
    void checkdiagonalDownWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(1, 5));
        assertEquals(false, gameBitmap.addChipToBitmap(2, 4));
        assertEquals(false, gameBitmap.addChipToBitmap(4, 2));
        assertEquals(true, gameBitmap.addChipToBitmap(3, 3));
    }

    @Test
    void checkFalseDiagonalDownWinCondition() {
        Bitmap gameBitmap = new Bitmap();
        assertEquals(false, gameBitmap.addChipToBitmap(0, 2));
        assertEquals(false, gameBitmap.addChipToBitmap(1, 1));
        assertEquals(false, gameBitmap.addChipToBitmap(2, 0));
        assertEquals(false, gameBitmap.addChipToBitmap(3, 5));
        assertEquals(false, gameBitmap.addChipToBitmap(4, 4));
    }
}

