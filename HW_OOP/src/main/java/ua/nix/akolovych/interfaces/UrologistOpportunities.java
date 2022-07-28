package ua.nix.akolovych.interfaces;

public interface UrologistOpportunities {
   String performProstateAnalysis(int numPatient);
   String sendPatientForFurtherExamination(int numPatient);
   String studiesTheMedicalHistoryHisPatient(int numPatient);

}
