package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    void twoStringObjectsContainTheSameData_stringFromUser_returnBoolean(){
        String str1 = "John Mayer";
        String str2 = "John";
        boolean expected = true;
        Task3 Task3 = new Task3();
        boolean actual = Task3.twoStringObjectsContainTheSameData(str1,str2);
        assertEquals(expected,actual,"Error");
    }
}
