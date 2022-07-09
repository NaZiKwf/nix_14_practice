package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    void setValue_StringvalueandBoxobject_returnString(){
        String str = "abc";
        String expected = "abc";
        Box b = new Box();
        Task2 Task2 = new Task2();
        String actual = Task2.setValue(str,b);
        assertEquals(expected,actual,"Error");
    }
}
