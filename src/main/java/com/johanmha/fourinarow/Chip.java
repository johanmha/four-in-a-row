package com.johanmha.fourinarow;

import com.johanmha.fourinarow.enums.ChipColor;

/**
 * Chip to put in a row
 *
 */
public class Chip {
    private final ChipColor color;

    public Chip(ChipColor color) {
        this.color = color;
    }

    public ChipColor getColor() {
        return color;
    }
}
