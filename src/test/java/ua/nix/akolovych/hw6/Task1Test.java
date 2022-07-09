package ua.nix.akolovych.hw6;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.hw1.Task1;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @Test
    void SquareNumber__returnint() {

        String emptyString = "";
        int expected = 0;
        ua.nix.akolovych.hw1.Task1 Task1 = new Task1();
        int actual = Task1.Symbols(emptyString);
        assertEquals(expected, actual, "Error in SumOfNumbers");
    }
}
