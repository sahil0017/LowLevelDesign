package com.system_design.lld.HospitalManagementSystem;

public class HospitalManagementApp {
    public static void main(String []args) {
        Doctor cardioDoctor = new Doctor("Sahil Kanungo", "Cardiologist");
        Doctor physician = new Doctor("Nandita Bohidar", "Physician");

        Patient patient1 = new Patient("Suhit");
        Patient patient2 = new Patient("Sujit");
        Patient patient3 = new Patient("Rishi");

        Room room1 = new Room("D-1001", 1);
        Room room2 = new Room("D-1010", 2);


        new Appointment(cardioDoctor, patient1, room1, "21:00:00 10th April, 2026");
        new Appointment(cardioDoctor, patient3, room1, "21:30:00 10th April, 2026");
        new Appointment(physician, patient2, room2, "21:30:00 10th April, 2026");
        new Appointment(physician, patient1, room1, "22:00:00 10th April, 2026");

        System.out.println(cardioDoctor.getDoctorName() + "'s patients:");
        for (Patient p : cardioDoctor.getPatients()) {
            System.out.println("  - " + p.getPatient());
        }

        System.out.println(patient1.getPatient() + "'s doctors:");
        for (Doctor d : patient1.getDoctors()) {
            System.out.println("  - " + d.getDoctorName() + " (" + d.getSpecialization() + ")");
        }

        System.out.println(cardioDoctor.getDoctorName() + "'s schedule:");
        for (Appointment a : cardioDoctor.getAppointmentList()) {
            System.out.println("  - " + a.getTime() + " with " + a.getPatient().getPatient()
                    + " in Room " + a.getRoom().getNumber());
        }


    }
}
