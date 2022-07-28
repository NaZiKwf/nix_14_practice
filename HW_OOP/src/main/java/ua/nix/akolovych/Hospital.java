package ua.nix.akolovych;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.nix.akolovych.classes.Doctor;

import java.util.ArrayList;
import java.util.List;

public class Hospital <T extends Doctor> {
    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    List <T> doctorsList;

    public Hospital() {
        this.doctorsList = new ArrayList<>();
    }

    void add(T doctor) {
        LOGGER_INFO.info("Add doctor");
        doctorsList.add(doctor);
    }

    void delete (T doctor){
        LOGGER_INFO.info("Delete doctor");
        doctorsList.remove(doctor);
    }

    void addAll(List <T> doctors){
        LOGGER_INFO.info("Add doctors");
        doctorsList.addAll(doctors);
    }

    int size (){
        return doctorsList.size();
    }
}
