package com.example;

public class Records {
   
    private int ChartId;
    private int EmployeeId;

    public void setChartId(int ChartId) {
        this.ChartId = ChartId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public Records() {}
    public Records(int ChartId, int EmployeeId) {
        super();
        this.ChartId = ChartId;
        this.EmployeeId = EmployeeId;
    }

    public int getChartId() {
        return this.ChartId;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }
}
