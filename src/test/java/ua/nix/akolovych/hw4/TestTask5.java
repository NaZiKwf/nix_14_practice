package ua.nix.akolovych.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTask5 {

    @Test
    void createNewPairedArr_arrayWithPairedElem_pairedArray() {
        int[] input = {1, 4, 4, 8, 5};
        int[] expected = {4, 4, 8};
        int[] actual = Task5.createNewPairedArr(input);
        assertArrayEquals(expected, actual, "Not correct");
    }

    @Test
    void createNewPairedArr_arrayWithNotPairedElem_emptyArr() {
        int[] input = {1, 7, 3, 9, 5};
        int[] expected = new int[0];
        int[] actual = Task5.createNewPairedArr(input);
        assertArrayEquals(expected, actual, "Not correct");

    }
}



