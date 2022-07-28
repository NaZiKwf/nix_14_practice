package ua.nix.akolovych.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.classes.HospitalPerson;
import ua.nix.akolovych.interfaces.PatientOpportunities;

public class Patient extends HospitalPerson implements PatientOpportunities {

    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private int numPatient;
    private int numDoctor;
    private String diagnosis;

    @Override
    public String toString() {
        return "Patient{" +
                "numPatient=" + numPatient +
                ", numDoctor=" + numDoctor +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public Patient(int numPatient, String name, int age, String sex, int numDoctor, String diagnosis) {
        super(name, age, sex);
        this.numPatient = numPatient;
        this.numDoctor = numDoctor;
        this.diagnosis = diagnosis;
        LOGGER_INFO.info("Create patient ");
    }

    public int getNumPatient() {
        return numPatient;
    }

    public void setNumPatient(int numPatient) {
        LOGGER_INFO.info("Change");
        this.numPatient = numPatient;
    }

    public int getNumDoctor() {
        return numDoctor;
    }

    public void setNumDoctor(int numDoctor) {
        LOGGER_INFO.info("Change");
        this.numDoctor = numDoctor;
    }

    public String getDiagnosis() {

        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        LOGGER_INFO.info("Change");
        this.diagnosis = diagnosis;
    }

    @Override
    public String Analys() {
        LOGGER_INFO.info("Completed");
        return "Patient " + numPatient + " take the test:" + "  ";
    }

    @Override
    public String seekMedicalAdvice(int numDoctor, int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Patient "+numPatient+" want to get medical advice from: "+numDoctor;
    }

    @Override
    public String getMedicalCertificate(String diagnosis, int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Patient " + numPatient + " want get medical certificate about: " + diagnosis;
    }

    @Override
    public String getPrescriptionForMedicine(int numPatient, int numDoctor) {
        LOGGER_INFO.info("Completed");
        return "Patient " + numPatient + " want get prescription for medicine from his doctor" + numDoctor;
    }
}

