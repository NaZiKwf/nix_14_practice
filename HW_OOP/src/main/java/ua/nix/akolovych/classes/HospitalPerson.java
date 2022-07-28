package ua.nix.akolovych.classes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class HospitalPerson {

    private static Logger LOGGER_INFO = LoggerFactory.getLogger("info");
    private String name;
    private int age;
    private String sex;

    public HospitalPerson(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        LOGGER_INFO.info("Create");
    }

    public String getName() {
        LOGGER_INFO.info("Change");
        return name;
    }

    public void setName(String name) {
        LOGGER_INFO.info("Change");
        this.name = name;
    }

    public int getAge() {
        LOGGER_INFO.info("Change");
        return age;
    }

    public void setAge(int age) {
        LOGGER_INFO.info("Change");
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        LOGGER_INFO.info("Change");
        this.sex = sex;
    }

    public abstract String Analys();
}
