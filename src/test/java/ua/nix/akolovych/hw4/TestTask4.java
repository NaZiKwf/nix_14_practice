package ua.nix.akolovych.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask4 {
    @Test
    void calculateAVG_array_doubleAVG(){
        int [] input = {1, 4, 4, 8, 5};
        double expected= 4.4D;
        double actual = Task4.calculateAVG(input);
        assertEquals(expected, actual,"Not correct");
    }
}
