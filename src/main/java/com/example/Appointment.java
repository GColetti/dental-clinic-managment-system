package com.example;

import java.sql.Date;
import java.sql.Time;

public class Appointment {
   
    private int AppointmentId;
    private int PatientId;
    private Date ApptDate;
    private Time StartTime;
    private Time EndTime;
    private String AppointmentType;
    private String Status;
    private int RoomAssigned;
   
    public void setAppointmentId(int AppointmentId) {
        this.AppointmentId = AppointmentId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public void setApptDate(Date ApptDate) {
        this.ApptDate = ApptDate;
    }

    public void setStartTime(Time StartTime) {
        this.StartTime = StartTime;
    }

    public void setEndTime(Time EndTime) {
        this.EndTime = EndTime;
    }

    public void setAppointmentType(String AppointmentType) {
        this.AppointmentType = AppointmentType;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setRoomAssigned(int RoomAssigned) {
        this.RoomAssigned = RoomAssigned;
    }

    public Appointment() {}
    public Appointment(int AppointmentId, int PatientId, Date ApptDate, Time StartTime, Time EndTime, String AppointmentType, String Status, int RoomAssigned) {
        super();
        this.AppointmentId = AppointmentId;
        this.PatientId = PatientId;
        this.ApptDate = ApptDate;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.AppointmentType = AppointmentType;
        this.Status = Status;
        this.RoomAssigned = RoomAssigned;
    }

    public int getAppointmentId() {
        return this.AppointmentId;
    }

    public int getPatientId() {
        return this.PatientId;
    }

    public Date getApptDate() {
        return this.ApptDate;
    }

    public Time getStartTime() {
        return this.StartTime;
    }

    public Time getEndTime() {
        return this.EndTime;
    }

    public String getAppointmentType() {
        return this.AppointmentType;
    }

    public String getStatus() {
        return this.Status;
    }

    public int getRoomAssigned() {
        return this.RoomAssigned;
    }    
}