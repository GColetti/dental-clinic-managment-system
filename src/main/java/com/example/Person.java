package com.example;


public class Person {
    private int UserId;
    private int Ssn;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Gender;
    private int StreetNumber;
    private String StreetName;
    private int AptNumber;
    private String City;
    private String Province;
    private String PostalCode;

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setSsn(int Ssn) {
        this.Ssn = Ssn;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

    public void setStreetNumber(int StreetNumber){
        this.StreetNumber = StreetNumber;
    }

    public void setStreetName(String StreetName){
        this.StreetName = StreetName;
    }

    public void setAptNumber(int AptNumber){
        this.AptNumber = AptNumber;
    }

    public void setCity(String City){
        this.City = City;
    }

    public void setProvince(String Province){
        this.Province = Province;
    }

    public void setPostalCode(String PostalCode){
        this.PostalCode = PostalCode;
    }

    
    public Person() {}
    public Person(int UserId, int Ssn, String FirstName, String MiddleName, String LastName, String Gender, int StreetNumber, String StreetName, int AptNumber, String City, String Province, String PostalCode) {
        super();
        this.UserId = UserId;
        this.Ssn = Ssn;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.Gender = Gender;
        this.StreetNumber = StreetNumber;
        this.StreetName = StreetName;
        this.AptNumber = AptNumber;
        this.City = City;
        this.Province = Province;
        this.PostalCode = PostalCode;

    }

    public int getUserId() {
        return this.UserId;
    }

    public int getSsn() {
        return this.Ssn;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public String getMiddleName() {
        return this.MiddleName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public String getGender(){
        return this.Gender;
    }

    public int getStreetNumber(){
        return this.StreetNumber;
    }

    public String getStreetName(){
        return this.StreetName;
    }

    public int getAptNumber(){
        return this.AptNumber;
    }
    
    public String getCity(){
        return this.City;
    }

    public String getProvince(){
        return this.Province;
    }

    public String getPostalCode(){
        return this.PostalCode;
    }
}
