package ua.nix.akolovych.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.interfaces.DoctorOpportunities;

import java.util.List;

public class Doctor extends HospitalPerson implements DoctorOpportunities {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private int salary;
    private int workExperience;
    private String category;

    public Doctor(String name, int age, String sex) {
        super(name, age, sex);
        this.salary = salary;
        this.workExperience = workExperience;
        this.category = category;
        LOGGER_INFO.info("Create");
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        LOGGER_INFO.info("Change");
        this.salary = salary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        LOGGER_INFO.info("Change");
        this.category = category;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        LOGGER_INFO.info("Change");
        this.workExperience = workExperience;
    }

    @Override
    public String Analys() {
        LOGGER_INFO.info("Completed");
        return "Doctor " + getName() + " ordered to take the test:" + "  ";
    }

    @Override
    public String callPatientForAppointment(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Doctor " + numPatient + " call this patient for appointment";
    }

    @Override
    public String examinePatient(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Doctor " + numPatient + " examine this patient";
    }

    @Override
    public String getResultOfPatientAnalys(int numPatient) {
        LOGGER_INFO.info("Completed");
        return "Doctor " + numPatient + " get result of patient analys";
    }

    public void callGroupOfPatients(List <? extends Patient> patients ){
        LOGGER_INFO.info("Completed");
        for (Patient patient : patients ){
            System.out.println(patient.toString());
        }
    }
}
