package ua.nix.akolovych;

import org.junit.jupiter.api.Test;
import ua.nix.akolovych.classes.Urologist;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    @Test
    void add_DoctorObject(){
        Hospital <Urologist> hospital1= new Hospital <>();
        Urologist ur1 = new Urologist("Pavlo Zibrov",87,"women");
        hospital1.add(ur1);
        int expected = 1;
        int actual = hospital1.size();
        assertEquals(expected,actual);
    }

    @Test
    void delete_DoctorObject(){
        Hospital <Urologist> hospital1= new Hospital <>();
        Urologist ur1 = new Urologist("Pavlo Zibrov",87,"women");
        hospital1.add(ur1);
        hospital1.delete(ur1);
        int expected = 0;
        int actual = hospital1.size();
        assertEquals(expected,actual);
    }
    @Test
    void addAll_DoctorsObjects(){
        Hospital <Urologist> hospital1= new Hospital <>();
        Urologist ur1 = new Urologist("Pavlo Zibrov",87,"women");
        Urologist ur2 = new Urologist("Dmytro Pavlo",102,"man-woman");
        List <Urologist> doctors = new ArrayList<>();
        doctors.add(ur1);
        doctors.add(ur2);
        hospital1.addAll(doctors);
        int expected = 2;
        int actual = hospital1.size();
        assertEquals(expected,actual);
    }
}
