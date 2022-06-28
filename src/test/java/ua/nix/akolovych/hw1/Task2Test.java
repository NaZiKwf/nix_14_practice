package ua.nix.akolovych.hw1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {

    @Test
    void Symbols_emptyString_returnMap() {

        String emptyString = "";
        Map<Character, Integer> expected = new HashMap<>();
        Task2 Task2 = new Task2();
        Map<Character, Integer> actual = Task2.Symbols(emptyString);
        assertEquals(expected, actual, "Error in Symbols");
    }

    @Test
    void Symbols_stringWithLetters_returnMap() {

        String strWithLetters = "apple";
        Map<Character, Integer>  expected = new HashMap<>();
        expected.put('a',1);
        expected.put ('p',2);
        expected.put('l',1);
        expected.put('e',1);
        Task2 Task2 = new Task2();
        Map<Character, Integer>  actual = Task2.Symbols(strWithLetters);
        assertEquals(expected, actual, "Error in Symbols");
    }

    @Test
    void Symbols_stringWithNumbers_returnMap() {

        String strWithNumbers = "14s24bbs";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('s',2);
        expected.put('b',2);
        Task2 Task2 = new Task2();
        Map<Character, Integer> actual = Task2.Symbols(strWithNumbers);
        assertEquals(expected, actual, "Error in Symbols");

    }
}
