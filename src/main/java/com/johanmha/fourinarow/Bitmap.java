package com.johanmha.fourinarow;

public class Bitmap {

    private long gameBitmap = 0L;
    private final int[] leftShifts = {1, 6, 7, 8};

    /**
     * Adds chip to bitmap by the algorithm (column * 7) + row
     * 
     * @param column
     * @param row
     * 
     * @return return true if win condition is found
     */
    public boolean addChipToBitmap(int column, int row) {
        int position = column * 7 + row;
        gameBitmap = gameBitmap | (1L << position);

        return checkForWin();
    }

    /**
     * For testing purposes. To check that the bitmap is what it should be
     * 
     * @return the bitmap
     */
    public long getGameBitmap() {
        return gameBitmap;
    }

    private boolean checkForWin() {
        boolean winFound = false;

        for (int i = 0; i < leftShifts.length; i++) {
            long testBitmap = gameBitmap;
            winFound = checkWinDirection(testBitmap, leftShifts[i]);

            if (winFound) {
                break;
            }
        }

        return winFound;
    }

    private boolean checkWinDirection(long testBitmap, int leftShift) {
        testBitmap = testBitmap & (testBitmap << leftShift);
        testBitmap = testBitmap & (testBitmap << leftShift * 2);
        return testBitmap != 0;
    }
}
