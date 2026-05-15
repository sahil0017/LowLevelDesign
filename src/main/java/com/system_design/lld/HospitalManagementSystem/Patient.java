package com.system_design.lld.HospitalManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Patient {
    private final String name;
    private final List<Appointment> appointmentList = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    public void addAppointment(Appointment appointment) {
        appointmentList.add(appointment);
    }

    public String getPatient() {
        return name;
    }

    public List<Appointment> getAppointmentList () {
        return appointmentList;
    }

    public List<Doctor> getDoctors() {
        return appointmentList.stream()
                .map(Appointment::getDoctor)
                .distinct()
                .collect(Collectors.toList());
    }
}
