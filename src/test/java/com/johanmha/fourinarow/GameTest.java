package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void createGamePlayChip() {
        Game game = new Game();
        assertEquals(0, game.playChip(3));
        assertEquals(1, game.playChip(3));
        assertEquals(0, game.playChip(6));
    }

}
