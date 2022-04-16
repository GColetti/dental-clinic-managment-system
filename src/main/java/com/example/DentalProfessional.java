package com.example;

public class DentalProfessional {
    private int BranchId;
    private int EmployeeId;
    private String DpRole;

    public void setBranchId(int BranchId) {
        this.BranchId = BranchId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setDpRole(String DpRole) {
        this.DpRole = DpRole;
    }

    public DentalProfessional() {}
    public DentalProfessional(int BranchId, int EmployeeId, String DpRole) {
        super();
        this.BranchId = BranchId;
        this.EmployeeId = EmployeeId;
        this.DpRole = DpRole;
       
    }
    
    public int getBranchId() {
        return this.BranchId;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public String getDpRole() {
        return this.DpRole;
    }
}
