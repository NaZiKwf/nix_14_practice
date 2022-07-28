package ua.nix.akolovych.interfaces;

public interface DoctorOpportunities  {
    String callPatientForAppointment(int numPatient);
    String examinePatient(int numPatient);
    String getResultOfPatientAnalys(int numPatient);
}
