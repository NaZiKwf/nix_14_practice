package ua.nix.akolovych.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.classes.Doctor;
import ua.nix.akolovych.interfaces.TherapeutistOpportunities;

public class Therapeutist extends Doctor implements TherapeutistOpportunities {

    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private int numTherapeutist;
    private String workingHours;

    public Therapeutist(String name, int age, String sex) {
        super(name, age, sex);
        this.numTherapeutist = numTherapeutist;
        this.workingHours = workingHours;
        LOGGER_INFO.info("Create");
    }


    public int getNumTherapeutist() {
        return numTherapeutist;
    }

    public void setNumTherapeutist(int numTherapeutist) {
        LOGGER_INFO.info("Change");
        this.numTherapeutist = numTherapeutist;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        LOGGER_INFO.info("Change");
        this.workingHours = workingHours;
    }

    @Override
    public String Analys() {
        LOGGER_INFO.info("Completed");
        return "Therapeutist: " + "num-" + getNumTherapeutist() + " " + getName() + " ordered to take the test:" + " feces.";
    }

    @Override
    public String sendToAnotherDoctor(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Therapeutist " + numPatient + " send this patient";
    }

    @Override
    public String sendForInpatientTreatment(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Therapeutist " + numPatient + " arrange for inpatient treatment";
    }

    @Override
    public String issueSickLeave(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Therapeutist " + numPatient + " issue a sick leave for this patient";
    }
}
