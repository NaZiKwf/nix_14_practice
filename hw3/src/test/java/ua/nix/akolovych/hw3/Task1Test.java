package ua.nix.akolovych.hw3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    void SumOfNumbers_emptyString_returnint() {

        String emptyString = "";
        int expected = 0;
        Task1 Task1 = new Task1();
        int actual = Task1.Symbols(emptyString);
        assertEquals(expected, actual, "Error in SumOfNumbers");
    }

    @Test
    void SumOfNumbers_stringWithLetters_returnint() {

        String strWithLetters = "dwadwadwadw";
        int expected = 0;
        Task1 Task1 = new Task1();
        int actual = Task1.Symbols(strWithLetters);
        assertEquals(expected, actual, "Error in SumOfNumbers");
    }

    @Test
    void SumOfNumbers_stringWithNumbers_returnint() {

        String strWithNumbers = "14s24bbs";
        int expected = 11;
        Task1 Task1 = new Task1();
        int actual = Task1.Symbols(strWithNumbers);
        assertEquals(expected, actual, "Error in SumOfNumbers");

    }
}