package com.example;

public class InsuranceClaim {
   
    private int InsuranceClaimId;
    private int PatientId;
    private int Amount;

    public void setInsuranceClaimId(int InsuranceClaimId) {
        this.InsuranceClaimId = InsuranceClaimId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
  
    public InsuranceClaim() {}
    public InsuranceClaim(int InsuranceClaimId, int PatientId, int Amount) {
        super();
        this.InsuranceClaimId = InsuranceClaimId;
        this.PatientId = PatientId;
        this.Amount = Amount; 
    }
    
    public int getInsuranceClaimId() {
        return this.InsuranceClaimId;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public int getAmount() {
        return this.Amount;
    }
}
