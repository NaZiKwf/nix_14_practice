package ua.nix.akolovych.interfaces;

public interface PatientOpportunities {
    String seekMedicalAdvice(int numDoctor, int numPatient);
    String getMedicalCertificate(String diagnosis, int numPatient);
    String getPrescriptionForMedicine(int numPatient, int numDoctor);
}
