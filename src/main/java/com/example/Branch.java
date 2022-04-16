package com.example;

public class Branch {
   
    private int BranchId;
    private String City;

    public void setBranchId(int BranchId) {
        this.BranchId = BranchId;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public Branch() {}
    public Branch(int BranchId, String City) {
        super();
        this.BranchId = BranchId;
        this.City = City;
      
    }

    public int getBranchId() {
        return this.BranchId;
    }

    public String getCity() {
        return this.City;
    }
}
