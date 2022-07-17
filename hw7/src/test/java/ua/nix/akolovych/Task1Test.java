package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
        @Test
        void getFirstSymbol_str_returnFirstSymbol(){
            String str = "Hello world!";
            String expected = "H";
            Task1 Task1 = new Task1();
            String actual = Task1.getFirstSymbol(str);
            assertEquals(expected,actual,"Error");
        }
        @Test
        void getLastSymbol_str_returnLastSymbol(){
            String str = "Hello world!";
            String expected = "!";
            Task1 Task1 = new Task1();
            String actual = Task1.getLastSymbol(str);
            assertEquals(expected,actual,"Error");
        }

        @Test
        void wordToCharArray_str2_returnCharsArray(){
            String str = "world";
            char [] expected = str.toCharArray() ;
            Task1 Task1 = new Task1();
            char [] actual = Task1.wordToCharArray(str);
            assertArrayEquals(expected,actual,"Error");
        }
        @Test
        void getCharByIndex_str2_returnSymbolByIndex(){
        String str = "world";
        char expected = 'l';
        Task1 Task1 = new Task1();
        char actual = Task1.getCharByIndex(str.toCharArray());
        assertEquals(expected,actual,"Error");
        }
}

