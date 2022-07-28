package ua.nix.akolovych.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrologistTest {
    @Test
    void setters_changeUrologistFields(){
        String expectedName = "Ivan";
        int expectedAge= 43;
        String expectedSex="man";
        int expectedNumUrologist = 17;
        String expectedSpecialization = "Specialist";

        Urologist ur1 = new Urologist("Ivanna Jo",32,"women");
        ur1.setName("Ivan");
        ur1.setAge(43);
        ur1.setSex("man");
        ur1.setNumUrologist(17);
        ur1.setSpecialization("Specialist");


        assertEquals(expectedName,ur1.getName());
        assertEquals(expectedAge,ur1.getAge());
        assertEquals(expectedSex,ur1.getSex());
        assertEquals(expectedNumUrologist,ur1.getNumUrologist());
        assertEquals(expectedSpecialization,ur1.getSpecialization());
    }

    @Test
    void performProstateAnalysis_returnString(){
        Urologist ur1 = new Urologist("Ivanna Jo",32,"women");
        String expected = "Urologist" + 01 + "perform prostate analysis for this patient";
        String actual = ur1.performProstateAnalysis(01);
        assertEquals(expected,actual);
    }

    @Test
    void sendPatientForFurtherExamination_returnString(){
        Urologist ur1 = new Urologist("Ivanna Jo",32,"women");
        String expected = "Urologist" + 01 + "send for further examination this patient";
        String actual = ur1.sendPatientForFurtherExamination(01);
        assertEquals(expected,actual);
    }

    @Test
    void studiesTheMedicalHistoryHisPatient_returnString(){
        Urologist ur1 = new Urologist("Ivanna Jo",32,"women");
        String expected = "Urologist" + 01 + "studies medical history";
        String actual = ur1.studiesTheMedicalHistoryHisPatient(01);
        assertEquals(expected,actual);
    }
}
