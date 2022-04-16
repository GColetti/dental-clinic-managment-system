package com.example;

public class Treatment {
   
    private int TreatmentId;
    private String TreatmentType;
    private String AppointmentType;
    private String Medication;

    public void setTreatmentId(int TreatmentId) {
        this.TreatmentId = TreatmentId;
    }

    public void setTreatmentType(String TreatmentType) {
        this.TreatmentType = TreatmentType;
    }

    public void setAppointmentType(String AppointmentType) {
        this.AppointmentType = AppointmentType;
    }

    public void setMedication(String Medication) {
        this.Medication = Medication;
    }

    public Treatment() {}
    public Treatment(int TreatmentId, String TreatmentType, String AppointmentType, String Medication) {
        super();
        this.TreatmentId = TreatmentId;
        this.TreatmentType = TreatmentType;
        this.AppointmentType = AppointmentType;
        this.Medication = Medication;
    }

    public int getTreatmentId() {
        return this.TreatmentId;
    }

    public String getTreatmentType() {
        return this.TreatmentType;
    }

    public String getAppointmentType() {
        return this.AppointmentType;
    }

    public String getMedication() {
        return this.Medication;
    }
    
}