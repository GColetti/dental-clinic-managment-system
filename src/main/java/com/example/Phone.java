package com.example;


public class Phone {
    private int PhoneNumber;
    private String PhoneLocation;
    private int UserId;

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setPhoneLocation(String PhoneLocation) {
        this.PhoneLocation = PhoneLocation;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public Phone() {}
    public Phone(int PhoneNumber, String PhoneLocation, int UserId) {
        super();
        this.PhoneNumber = PhoneNumber;
        this.PhoneLocation = PhoneLocation;
        this.UserId = UserId;
    }

    public int getPhoneNumber() {
        return this.PhoneNumber;
    }

    public String getPhoneLocation() {
        return this.PhoneLocation;
    }

    public int getUserId() {
        return this.UserId;
    }
   

}
