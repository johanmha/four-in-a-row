package com.johanmha.fourinarow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.johanmha.fourinarow.enums.ChipColor;

class ChipTest {
    @Test
    void chipCreation() {
        Chip redChip = new Chip(ChipColor.RED);
        assertEquals(ChipColor.RED, redChip.getColor());

        Chip yellowChip = new Chip(ChipColor.YELLOW);
        assertEquals(ChipColor.YELLOW, yellowChip.getColor());
    }
}
