package ua.nix.akolovych.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TherapeutistTest {
    @Test
    void setters_changeTherapeutistFields(){
        String expectedName = "Ivan";
        int expectedAge= 43;
        String expectedSex="man";
        int expectedNumTherapeutist = 17;
        String expectedWorkingHours = "8:00 16:00";

        Therapeutist the1 = new Therapeutist("Ivanna Jo",32,"women");
        the1.setName("Ivan");
        the1.setAge(43);
        the1.setSex("man");
        the1.setWorkingHours("8:00 16:00");
        the1.setNumTherapeutist(17);


        assertEquals(expectedName,the1.getName());
        assertEquals(expectedAge,the1.getAge());
        assertEquals(expectedSex,the1.getSex());
        assertEquals(expectedNumTherapeutist,the1.getNumTherapeutist());
        assertEquals(expectedWorkingHours,the1.getWorkingHours());
    }

    @Test
    void sendToAnotherDoctor_returnString(){
        Therapeutist the1 = new Therapeutist("Ivanna Jo",32,"women");
        String expected = "Therapeutist " + 01 + " send this patient";
        String actual = the1.sendToAnotherDoctor(01);
        assertEquals(expected,actual);
    }

    @Test
    void sendForInpatientTreatment_returnString(){
        Therapeutist the1 = new Therapeutist("Ivanna Jo",32,"women");
        String expected = "Therapeutist " + 01 + " arrange for inpatient treatment";
        String actual = the1.sendForInpatientTreatment(01);
        assertEquals(expected,actual);
    }
    @Test
    void issueSickLeave_returnString(){
        Therapeutist the1 = new Therapeutist("Ivanna Jo",32,"women");
        String expected = "Therapeutist " + 01 + " issue a sick leave for this patient";
        String actual = the1.issueSickLeave(01);
        assertEquals(expected,actual);
    }

}
