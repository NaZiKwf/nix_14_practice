package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @Test
    void SquareNumber_intvalue_returnsquareofintvalue(){
        int value = 5;
        int expected = 25;
        Task1 Task1 = new Task1();
        int actual = Task1.SquareNumber(value);
        assertEquals(expected,actual,"Error");
    }
   @Test
    void StringReverse_StringStringWithLetters_returnStringWithReversLetters(){
       String str = "abc";
       String expected = "cba";
       Task1 Task1 = new Task1();
       String actual = Task1.StringReverse(str);
       assertEquals(expected,actual,"Error");
    }

}
