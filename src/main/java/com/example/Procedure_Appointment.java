package com.example;

import java.sql.Date;

public class Procedure_Appointment {
   
    private int AppointmentId;
    private String ProcedureCode;
    private Date ProcDate;
    private int ToothInvolved;
    private int AmountOfProcedure;
    private int PatientCharge;
    private int InsuranceCharge;

    public void setAppointmentId(int AppointmentId) {
        this.AppointmentId = AppointmentId;
    }

    public void setProcedureCode(String ProcedureCode) {
        this.ProcedureCode = ProcedureCode;
    }

    public void setProcDate(Date ProcDate) {
        this.ProcDate = ProcDate;
    }

    public void setToothInvolved(int ToothInvolved) {
        this.ToothInvolved = ToothInvolved;
    }

    public void setAmountOfProcedure(int AmountOfProcedure) {
        this.AmountOfProcedure = AmountOfProcedure;
    }

    public void setPatientCharge(int PatientCharge) {
        this.PatientCharge = PatientCharge;
    }

    public void setInsuranceCharge(int InsuranceCharge) {
        this.InsuranceCharge = InsuranceCharge;
    }

    public Procedure_Appointment() {}
    public Procedure_Appointment(int AppointmentId, String ProcedureCode, Date ProcDate, int ToothInvolved, int AmountOfProcedure, int PatientCharge, int InsuranceCharge) {
        super();
        this.AppointmentId = AppointmentId;
        this.ProcedureCode = ProcedureCode;
        this.ProcDate = ProcDate;
        this.ToothInvolved = ToothInvolved;
        this.AmountOfProcedure = AmountOfProcedure;
        this.PatientCharge = PatientCharge;
        this.InsuranceCharge = InsuranceCharge;
    }

    public int getAppointmentId() {
        return this.AppointmentId;
    }

    public String getProcedureCode() {
        return this.ProcedureCode;
    }

    public Date getProcDate() {
        return this.ProcDate;
    }

    public int getToothInvolved() {
        return this.ToothInvolved;
    }

    public int getAmountOfProcedure() {
        return this.AmountOfProcedure;
    }

    public int getPatientCharge() {
        return this.PatientCharge;
    }

    public int getInsuranceCharge() {
        return this.InsuranceCharge;
    }    
}
