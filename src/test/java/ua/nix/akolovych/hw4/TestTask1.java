package ua.nix.akolovych.hw4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask1 {

    @Test
    void searchIndexOfMaxElem_array_maxElemIndex(){
        int [] input = {18, 48, 56, 78, 45};
        int expectedIndex= 3;
        int actual = Task1.searchIndexOfMaxElem(input);
        assertEquals(expectedIndex,actual,"Not correct");
    }

}
