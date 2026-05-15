package com.system_design.lld.HospitalManagementSystem;

public class Appointment {
    private final Doctor doctor;
    private final Patient patient;
    private final Room room;
    private final String time;

    public Appointment (Doctor doctor, Patient patient, Room room, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.room = room;
        this.time = time;

        doctor.addAppointment(this);
        patient.addAppointment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom () {
        return room;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getTime() {
        return time;
    }
}
