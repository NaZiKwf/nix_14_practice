package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {
    @Test
    void comparisonOfThisStringWithAnotherLine_strFromUser_boolean(){
        String str1 = "Stephen Edwin King";
        String str2 = "stephen edwin king";
        boolean expected = true;
        Task4 Task4 = new Task4();
        boolean actual = Task4.comparisonOfThisStringWithAnotherLine(str1,str2);
        assertEquals(expected,actual,"Error");
    }
}
