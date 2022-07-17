package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    void expiresUnderTheTerm_strFromUser_returnBoolean(){
        String str1 = "Nazar";
        String end_str = "ar";
        boolean expected = true;
        Task2 Task2 = new Task2();
        boolean actual = Task2.expiresUnderTheTerm(str1,end_str);
        assertEquals(expected,actual,"Error");
    }
}
