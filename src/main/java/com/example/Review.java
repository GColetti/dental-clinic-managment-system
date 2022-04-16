package com.example;

public class Review {
   
    private int ReviewId;
    private int PatientId;
    private int Professionalism;
    private int Communication;
    private int Cleanliness;
    private int EmployeeValue;
    
    public void setReviewId(int ReviewId) {
        this.ReviewId = ReviewId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setProfessionalism(int Professionalism) {
        this.Professionalism = Professionalism;
    }

    public void setCommunication(int Communication) {
        this.Communication = Communication;
    }

    public void setCleanliness(int Cleanliness) {
        this.Cleanliness = Cleanliness;
    }

    public void setEmployeeValue(int EmployeeValue) {
        this.EmployeeValue = EmployeeValue;
    }

    public Review() {}
    public Review(int ReviewId, int PatientId, int Professionalism, int Communication, int Cleanliness, int EmployeeValue) {
        super();
        this.ReviewId = ReviewId;
        this.PatientId = PatientId;
        this.Professionalism = Professionalism;
        this.Communication = Communication;
        this.Cleanliness = Cleanliness;
        this.EmployeeValue = EmployeeValue;
    }

    public int getReviewId() {
        return this.ReviewId;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public int getProfessionalism() {
        return this.Professionalism;
    }

    public int getCommunication() {
        return this.Communication;
    }

    public int getCleanliness() {
        return this.Cleanliness;
    }

    public int getEmployeeValue() {
        return this.EmployeeValue;
    }    
}