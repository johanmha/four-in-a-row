package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.johanmha.fourinarow.enums.ChipColor;

class PlayerTest {
    @Test
    void addChips() {
        Board playingBoard = new Board();
        Player playerRed = new Player(ChipColor.RED, playingBoard);
        Player playerYellow = new Player(ChipColor.YELLOW, playingBoard);

        assertEquals(0, playerRed.addChip(3));
        assertEquals(1, playerYellow.addChip(3));
    }
}
