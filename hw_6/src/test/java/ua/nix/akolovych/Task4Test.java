package ua.nix.akolovych;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4Test {

    @Test
    void recursiceMultiplication_numFromUser_returnResult(){
        int val1 = 5;
        int val2= 5;
        int expected = 25;
        Task4 Task4 = new Task4();
        int actual = Task4.recursiveMultiplication(val1,val2);
        assertEquals(expected,actual,"Error");
    }
}
