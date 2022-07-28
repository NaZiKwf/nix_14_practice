package ua.nix.akolovych.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.classes.Doctor;
import ua.nix.akolovych.interfaces.UrologistOpportunities;

public class Urologist extends Doctor implements UrologistOpportunities {

    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private int numUrologist;
    private String specialization;

    public Urologist(String name, int age, String sex) {
        super(name, age, sex);
        this.specialization = specialization;
        this.numUrologist = numUrologist;
        LOGGER_INFO.info("Create");
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        LOGGER_INFO.info("Change");
        this.specialization = specialization;
    }


    public int getNumUrologist() {
        return numUrologist;
    }

    public void setNumUrologist(int numUrologist) {
        LOGGER_INFO.info("Change");
        this.numUrologist = numUrologist;
    }

    @Override
    public String Analys() {
        LOGGER_INFO.info("Completed");
        return "Urologist: " + "num-" + getNumUrologist()+ " " + getName() + " ordered to take the test:" + " blood.";
    }

    @Override
    public String performProstateAnalysis(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Urologist" + numPatient + "perform prostate analysis for this patient";
    }

    @Override
    public String sendPatientForFurtherExamination(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Urologist" + numPatient + "send for further examination this patient";
    }

    @Override
    public String studiesTheMedicalHistoryHisPatient(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Urologist" + numPatient + "studies medical history";
    }
}
