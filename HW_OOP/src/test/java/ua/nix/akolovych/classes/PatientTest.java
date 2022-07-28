package ua.nix.akolovych.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientTest {
    @Test
    void setters_changePatientFields(){
        String expectedName = "Ivan";
        int expectedAge= 43;
        String expectedSex="man";
        int expectedNumPatient = 11;
        int expectedNumDoctor = 14;
        String expectedDiagnosis = "AIDS";

        Patient pt1 = new Patient(04,"Pavlo Nesterenko",32,"women",04,"Just cancer");
        pt1.setName("Ivan");
        pt1.setAge(43);
        pt1.setDiagnosis("AIDS");
        pt1.setNumPatient(11);
        pt1.setNumDoctor(14);
        pt1.setSex("man");


        assertEquals(expectedName,pt1.getName());
        assertEquals(expectedAge,pt1.getAge());
        assertEquals(expectedSex,pt1.getSex());
        assertEquals(expectedDiagnosis,pt1.getDiagnosis());
        assertEquals(expectedNumDoctor,pt1.getNumDoctor());
        assertEquals(expectedNumPatient,pt1.getNumPatient());
    }

    @Test
    void Analys_returnString(){
        Patient pt1 = new Patient(01,"Pavlo",18,"man",01,"Impotence");
        String expected = "Patient " + 01 + " take the test:" + "  ";;
        String actual = pt1.Analys();
        assertEquals(expected,actual);
    }

    @Test
    void seekMedicalAdvice_returnString(){
        Patient pt1 = new Patient(01,"Pavlo",18,"man",01,"Impotence");
        String expected = "Patient "+02+" want to get medical advice from: "+01;
        String actual = pt1.seekMedicalAdvice(01,02);
        assertEquals(expected,actual);
    }
    @Test
    void getMedicalCertificate_returnString(){
        Patient pt1 = new Patient(01,"Pavlo",18,"man",01,"Impotence");
        String expected = "Patient " + 01 + " want get medical certificate about: " + "Impotence";
        String actual = pt1.getMedicalCertificate("Impotence",01);
        assertEquals(expected,actual);
    }
    @Test
    void getPrescriptionForMedicine_returnString(){
        Patient pt1 = new Patient(01,"Pavlo",18,"man",01,"Impotence");
        String expected = "Patient " + 01 + " want get prescription for medicine from his doctor" + 4;
        String actual = pt1.getPrescriptionForMedicine(01,4);
        assertEquals(expected,actual);
    }

}
