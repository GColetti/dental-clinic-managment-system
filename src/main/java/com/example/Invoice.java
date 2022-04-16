package com.example;

import java.sql.Date;

public class Invoice {
   
    private int InvoiceId;
    private int UserId;
    private int ReceptionistId;
    private int FeeId;
    private int InsuranceClaimId;
    private Date DateOfIssue;
    private String Contact;
    private int PatientCharge;
    private int InsuranceCharge;
    private int TotalCharge;
    private int Discount;
    private int Penalty;
    private String PaymentType;

    public void setInvoiceId(int InvoiceId) {
        this.InvoiceId = InvoiceId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setReceptionistId(int ReceptionistId) {
        this.ReceptionistId = ReceptionistId;
    }

    public void setFeeId(int FeeId) {
        this.FeeId = FeeId;
    }

    public void setInsuranceClaimId(int InsuranceClaimId) {
        this.InsuranceClaimId = InsuranceClaimId;
    }

    public void setDateOfIssue(Date DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public void setPatientCharge(int PatientCharge) {
        this.PatientCharge = PatientCharge;
    }

    public void setInsuranceCharge(int InsuranceCharge) {
        this.InsuranceCharge = InsuranceCharge;
    }

    public void setTotalCharge(int TotalCharge) {
        this.TotalCharge = TotalCharge;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    public void setPenalty(int Penalty) {
        this.Penalty = Penalty;
    }

    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    public Invoice() {}
    public Invoice(int InvoiceId, int UserId, int ReceptionistId, int FeeId, int InsuranceClaimId, Date DateOfIssue, String Contact, int PatientCharge, int InsuranceCharge, int TotalCharge, int Discount, int Penalty, String PaymentType) {
        super();
        this.InvoiceId = InvoiceId;
        this.UserId = UserId;
        this.ReceptionistId = ReceptionistId;
        this.FeeId = FeeId;
        this.InsuranceClaimId = InsuranceClaimId;
        this.DateOfIssue = DateOfIssue;
        this.Contact = Contact;
        this.PatientCharge = PatientCharge;
        this.InsuranceCharge = InsuranceCharge;
        this.TotalCharge = TotalCharge;
        this.Discount = Discount;
        this.Penalty = Penalty;
        this.PaymentType = PaymentType;
      
    }

    public int getInvoiceId() {
        return this.InvoiceId;
    }

    public int getUserId() {
        return this.UserId;
    }

    public int getReceptionistId() {
        return this.ReceptionistId;
    }

    public int getFeeId() {
        return this.FeeId;
    }

    public int getInsuranceClaimId() {
        return this.InsuranceClaimId;
    }

    public Date getDateOfIssue() {
        return this.DateOfIssue;
    }

    public String getContact() {
        return this.Contact;
    }

    public int getPatientCharge() {
        return this.PatientCharge;
    }

    public int getInsuranceCharge() {
        return this.InsuranceCharge;
    }

    public int getTotalCharge() {
        return this.TotalCharge;
    }

    public int getDiscount() {
        return this.Discount;
    }

    public int getPenalty() {
        return this.Penalty;
    }

    public String getPaymentType() {
        return this.PaymentType;
    }
}
