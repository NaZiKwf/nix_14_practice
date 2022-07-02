package ua.nix.akolovych.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask3 {
    @Test
    void arrayGrowing_growingArray_boolean(){
        int [] input = {18, 48, 56, 78};
        boolean expected= true;
        boolean actual = Task3.arrayGrowing(input);
        assertEquals(expected, actual,"Not correct");
    }

    @Test
    void arrayGrowing_notGrowingArray_boolean(){
        int [] input = {18, 48, 16, 58};
        boolean expected= false;
        boolean actual = Task3.arrayGrowing(input);
        assertEquals(expected, actual,"Not correct");
    }
}
