package com.example;

public class Receives {
   
    private int PatientId;
    private int TreatmentId;
    private String AddComments;
    private int Tooth;

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setTreatmentId(int TreatmentId) {
        this.TreatmentId = TreatmentId;
    }

    public void setAddlComments(String AddComments) {
        this.AddComments = AddComments;
    }

    public void setTooth(int Tooth) {
        this.Tooth = Tooth;
    }

    public Receives() {}
    public Receives(int PatientId, int TreatmentId, String AddComments, int Tooth) {
        super();
        this.PatientId = PatientId;
        this.TreatmentId = TreatmentId;
        this.AddComments = AddComments;
        this.Tooth = Tooth;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public int getTreatmentId() {
        return this.TreatmentId;
    }

    public String getAddComments() {
        return this.AddComments;
    }

    public int getTooth() {
        return this.Tooth;
    }

    
}