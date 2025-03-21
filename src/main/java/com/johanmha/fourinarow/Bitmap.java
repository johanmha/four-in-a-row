package com.johanmha.fourinarow;

public class Bitmap {

    private long gameBitmap = 0L;
    private boolean win = false;

    /**
     * Adds chip to bitmap by the algorithm (column * 7) + row
     * 
     * @param column
     * @param row
     */
    public void addChipToBitmap(int column, int row) {
        int position = column * 7 + row;
        gameBitmap = gameBitmap | (1L << position);
    }

    public boolean isWin() {
        return win;
    }

    /**
     * For testing purposes. To check that the bitmap is what it should be
     * 
     * @return the bitmap
     */
    public long getGameBitmap() {
        return gameBitmap;
    }


}
