package com.example;

public class DentalProcedure {
   
    private String ProcedureCode;
    private String ProcedureType;
    private String Description;
    private int TotalCharge;

    public void setProcedureCode(String ProcedureCode) {
        this.ProcedureCode = ProcedureCode;
    }

    public void setProcedureType(String ProcedureType) {
        this.ProcedureType = ProcedureType;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setTotalCharge(int TotalCharge) {
        this.TotalCharge = TotalCharge;
    }

    public DentalProcedure() {}
    public DentalProcedure(String ProcedureCode, String ProcedureType, String Description, int TotalCharge) {
        super();
        this.ProcedureCode = ProcedureCode;
        this.ProcedureType = ProcedureType;
        this.Description = Description;
        this.TotalCharge = TotalCharge;
        
    }

    public String getProcedureCode() {
        return this.ProcedureCode;
    }

    public String getProcedureType() {
        return this.ProcedureType;
    }

    public String getDescription() {
        return this.Description;
    }

    public int getTotalCharge() {
        return this.TotalCharge;
    }

    
}
