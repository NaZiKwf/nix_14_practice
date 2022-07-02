package ua.nix.akolovych.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTask2 {
    @Test
    void replaceElemWithOddIndex_array_returnArray(){
        int [] input = {18, 48, 56, 78, 45, -1};
        int [] expected= {18, 0, 56, 0, 45, 0};
        int[] actual = Task2.replaceElemWithOddIndex(input);
        assertArrayEquals(expected, actual,"Not correct");
    }
}
