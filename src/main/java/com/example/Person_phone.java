package com.example;


public class Person_phone {
    private int PhoneNumber;
    private int UserId;

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public Person_phone() {}
    public Person_phone(int UserId, int PhoneNumber) {
        super();
        this.PhoneNumber = PhoneNumber;
        this.UserId = UserId;
    }

    public int getPhoneNumber() {
        return this.PhoneNumber;
    }

    public int getUserId() {
        return this.UserId;
    }
   

}
