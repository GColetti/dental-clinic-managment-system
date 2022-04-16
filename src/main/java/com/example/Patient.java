package com.example;

import java.sql.Date;

public class Patient {
   
    private int UserId;
    private int PatientId;
    private String Email;
    private Date DateOfBirth;

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Patient() {}
    public Patient(int UserId, int PatientId, String Email, Date DateOfBirth) {
        super();
        this.UserId = UserId;
        this.PatientId = PatientId;
        this.Email = Email;
        this.DateOfBirth = DateOfBirth;
      
    }

    public int getUserId() {
        return this.UserId;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public String getEmail() {
        return this.Email;
    }

    public Date getDateOfBirth() {
        return this.DateOfBirth;
    }
}
