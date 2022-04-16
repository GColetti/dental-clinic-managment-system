package com.example;

public class PatientChart {
   
    private int PatientId;
    private int ChartId;
    private int EmployeeId;
    private String ProgressNotes;

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setChartId(int ChartId) {
        this.ChartId = ChartId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setProgressNotes(String ProgressNotes) {
        this.ProgressNotes = ProgressNotes;
    }

    public PatientChart() {}
    public PatientChart(int PatientId, int ChartId, int EmployeeId, String ProgressNotes) {
        super();
        this.PatientId = PatientId;
        this.ChartId = ChartId;
        this.EmployeeId = EmployeeId;
        this.ProgressNotes = ProgressNotes;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public int getChartId() {
        return this.ChartId;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public String getProgressNotes() {
        return this.ProgressNotes;
    }

 
}
