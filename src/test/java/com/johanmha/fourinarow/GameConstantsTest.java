package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class GameConstantsTest {

    @Test
    void checkConstants() {
        assertEquals(7, GameConstants.BOARD_COLUMNS);
        assertEquals(6, GameConstants.BOARD_ROWS);
    }

}
