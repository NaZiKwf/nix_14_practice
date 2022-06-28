package ua.nix.akolovych.hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    void SchoolSchedule_lessonNumLessThan1_returnString() {

        int lessonNum = 0;
        String expected = "Error" ;
        Task3 Task3 = new Task3();
        String actual = Task3.SchoolSchedule(lessonNum);
        assertEquals(expected, actual, "Error in SchoolSchedule");
    }


    @Test
    void SchoolSchedule_lessonNumMoreThan10_returnString() {

        int lessonNum = 11;
        String expected = "Error" ;
        Task3 Task3 = new Task3();
        String actual = Task3.SchoolSchedule(lessonNum);
        assertEquals(expected, actual, "Error in SchoolSchedule");
    }

    @Test
    void SchoolSchedule_lessonNumBetween1and10_returnString() {

        int lessonNum = 2;
        String expected = "10 35" ;
        Task3 Task3 = new Task3();
        String actual = Task3.SchoolSchedule(lessonNum);
        assertEquals(expected, actual, "Error in SchoolSchedule");
    }
}
