package com.example;

public class Dentist_Appointment {
   
    private int AppointmentId;
    private int DentistId;

    public void setAppointmentId(int AppointmentId) {
        this.AppointmentId = AppointmentId;
    }

    public void setDentistId(int DentistId) {
        this.DentistId = DentistId;
    }

    public Dentist_Appointment() {}
    public Dentist_Appointment(int AppointmentId, int DentistId) {
        super();
        this.AppointmentId = AppointmentId;
        this.DentistId = DentistId;
    }

    public int getAppointmentId() {
        return this.AppointmentId;
    }

    public int getDentistId() {
        return this.DentistId;
    }
}
