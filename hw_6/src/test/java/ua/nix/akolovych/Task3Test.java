package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Task3Test {
    @Test
    void createObject_InputString_BoxObject(){
        String str = "abc";
        String expected = "abc";
        Box b = new Box();
        b.setValue(str);
        Task3 Task3 = new Task3();
        Box actual = Task3.createObject(str);
        assertEquals(expected,actual.getValue(),"Error");
    }
}
