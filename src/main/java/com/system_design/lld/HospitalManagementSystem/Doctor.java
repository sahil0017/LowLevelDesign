package com.system_design.lld.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doctor {
    private final String name;
    private final String specialization;
    private final List<Appointment> appointmentList = new ArrayList<>();

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public void addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public String getDoctorName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public List<Patient> getPatients() {
        return appointmentList.stream()
                .map(Appointment::getPatient)
                .distinct()
                .collect(Collectors.toList());
    }
}
