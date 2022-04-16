package com.example;


public class Employee {
    private int UserId;
    private int EmployeeId;
    private String EmployeeEmail;
    private int Salary;

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public void setEmployeeEmail(String EmployeeEmail) {
        this.EmployeeEmail = EmployeeEmail;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }


    public Employee() {}
    public Employee(int UserId, int EmployeeId, String EmployeeEmail, int Salary) {
        super();
        this.UserId = UserId;
        this.EmployeeId = EmployeeId;
        this.EmployeeEmail = EmployeeEmail;
        this.Salary = Salary;
       
    }
    
    public int getUserId() {
        return this.UserId;
    }

    public int getEmployeeId() {
        return this.EmployeeId;
    }

    public String getEmployeeEmail() {
        return this.EmployeeEmail;
    }

    public int getSalary() {
        return this.Salary;
    }
}
