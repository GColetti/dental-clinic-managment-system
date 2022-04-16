package com.example;

public class FeeCharge {
   
    private int FeeId;
    private String ProcedureCode;
    private int Amount;

    public void setFeeId(int FeeId) {
        this.FeeId = FeeId;
    }

    public void setProcedureCode(String ProcedureCode) {
        this.ProcedureCode = ProcedureCode;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
  
    public FeeCharge() {}
    public FeeCharge(int FeeId, String ProcedureCode, int Amount) {
        super();
        this.FeeId = FeeId;
        this.ProcedureCode = ProcedureCode;
        this.Amount = Amount;
    }

    public int getFeeId() {
        return this.FeeId;
    }

    public String getProcedureCode() {
        return this.ProcedureCode;
    }
    
    public int getAmount() {
        return this.Amount;
    }
}
