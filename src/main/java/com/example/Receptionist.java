package com.example;


public class Receptionist {
   
    private int EmployeeId;
    private int BranchId;

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setBranchId(int BranchId) {
        this.BranchId = BranchId;
    }

    public Receptionist() {}
    public Receptionist(int EmployeeId, int BranchId) {
        super();
        this.EmployeeId = EmployeeId;
        this.BranchId = BranchId;
    
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public int getBranchId() {
        return this.BranchId;
    }
    
}
