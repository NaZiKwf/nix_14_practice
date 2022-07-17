package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {
    @Test
    void lineStartsWithTheContentsOfAnotherline_strFromUser_boolean(){
        String str1 = "Stephen Edwin King";
        String startStr = "Stephen";
        boolean expected = true;
        Task5 Task5 = new Task5();
        boolean actual = Task5.lineStartsWithTheContentsOfAnotherline(str1,startStr);
        assertEquals(expected,actual,"Error");
    }
}
