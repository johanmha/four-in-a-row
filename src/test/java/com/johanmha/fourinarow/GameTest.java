package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.johanmha.fourinarow.enums.ChipColor;

class GameTest {

    @Test
    void playChip() {
        Game game = new Game();

        assertEquals(0, game.placeChip(3));
        assertEquals(1, game.placeChip(3));
        assertEquals(0, game.placeChip(6));
    }

    @Test
    void fillColumn() {
        Game game = new Game();

        assertEquals(false, game.isColumnFull(6));

        for (int i = 0; i < GameConstants.BOARD_ROWS; i++) {
            game.placeChip(6);
        }

        assertEquals(true, game.isColumnFull(6));
        assertEquals(-1, game.placeChip(6));
    }

    @Test
    void getChip() {
        Game game = new Game();
        game.placeChip(3);
        game.placeChip(3);
        assertEquals(ChipColor.RED, game.getChip(3, 0).getColor());
        assertEquals(ChipColor.YELLOW, game.getChip(3, 1).getColor());
    }

}
