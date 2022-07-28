package ua.nix.akolovych;

import ua.nix.akolovych.classes.HospitalPerson;
import ua.nix.akolovych.classes.Patient;
import ua.nix.akolovych.classes.Therapeutist;
import ua.nix.akolovych.classes.Urologist;
import ua.nix.akolovych.classes.Doctor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patient pt1 = new Patient(01,"Ivan Pidgainyi",26,"man",02,"AIDS");
        Patient pt2 = new Patient(02,"Anton Pavlenko",29,"man",03,"Cancer");
        Patient pt3 = new Patient(03,"Petro Zinchenko",21,"man",05,"Impotence");
        Patient pt4 = new Patient(04,"Stefan Zinchenko",19,"man",03,"Testicular cancer");
        Patient pt5 = new Patient(05,"Ivanna Zinchenko",25,"man",03,"Breast cancer");



        Therapeutist the1 = new Therapeutist("Pavlo Yarmolenko",45,"man");
        Urologist ur1= new Urologist("Jo Da", 54,"man");
        Doctor doc1= new Doctor("Maryna Holodnyak", 34, "woman");


        List <Patient> patients  = new ArrayList<>();
        patients.add(pt1);
        patients.add(pt2);
        patients.add(pt3);
        patients.add(pt4);
        patients.add(pt5);

        System.out.println(the1.Analys());

        System.out.println(the1.sendToAnotherDoctor(01));
        System.out.println(the1.sendForInpatientTreatment(01));
        System.out.println(the1.issueSickLeave(01));

        System.out.println(ur1.performProstateAnalysis(01));
        System.out.println(ur1.studiesTheMedicalHistoryHisPatient(01));
        System.out.println(ur1.sendPatientForFurtherExamination(01));


        System.out.println(pt1.getMedicalCertificate("AIDS",01));
        System.out.println(pt1.getPrescriptionForMedicine(01,01));
        System.out.println(pt1.seekMedicalAdvice(01,01));

        System.out.println(doc1.examinePatient(01));
        System.out.println(doc1.callPatientForAppointment(01));
        System.out.println(doc1.getResultOfPatientAnalys(01));
        doc1.callGroupOfPatients(patients);


    }

}
