package ua.nix.akolovych.interfaces;

public interface TherapeutistOpportunities {
    String sendToAnotherDoctor(int numPatient);
    String sendForInpatientTreatment(int numPatient);
    String issueSickLeave(int numPatient);
}
