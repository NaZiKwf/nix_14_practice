package ua.nix.akolovych.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTest {

    @Test
    void setters_changeDoctorFields(){
        String expectedName = "Ivan";
        int expectedAge= 43;
        String expectedSex="man";
        int expectedSalary = 10000;
        int expectedWorkExperience = 11;
        String expectedCategory = "VIP";

        Doctor doc1 = new Doctor("Pavlo Tak",32,"women");
        doc1.setName("Ivan");
        doc1.setSalary(10000);
        doc1.setAge(43);
        doc1.setSex("man");
        doc1.setCategory("VIP");
        doc1.setWorkExperience(11);

        assertEquals(expectedName,doc1.getName());
        assertEquals(expectedAge,doc1.getAge());
        assertEquals(expectedSex,doc1.getSex());
        assertEquals(expectedSalary,doc1.getSalary());
        assertEquals(expectedWorkExperience,doc1.getWorkExperience());
        assertEquals(expectedCategory,doc1.getCategory());
    }

    @Test
    void callPatientForAppointment_returnString(){

        Doctor doc1 = new Doctor("Pavlo Tak",32,"women");
        String expected = "Doctor " + 12 + " call this patient for appointment";
        String actual = doc1.callPatientForAppointment(12);
        assertEquals(expected,actual);
    }

    @Test
    void examinePatient_returnString(){
        Doctor doc1 = new Doctor("Pavlo Tak",32,"women");
        String expected = "Doctor " + 12 + " examine this patient";;
        String actual = doc1.examinePatient(12);
        assertEquals(expected,actual);
    }

    @Test
    void getResultOfPatientAnalys_returnString(){
        Doctor doc1 = new Doctor("Pavlo Tak",32,"women");
        String expected = "Doctor " + 12 + " get result of patient analys";
        String actual = doc1.getResultOfPatientAnalys(12);
        assertEquals(expected,actual);
    }

    @Test
    void Analys_returnString(){
        Doctor doc1 = new Doctor("Pavlo Tak",32,"women");
        String expected = "Doctor " + "Pavlo Tak" + " ordered to take the test:" + "  ";
        String actual = doc1.Analys();
        assertEquals(expected,actual);
    }
}
