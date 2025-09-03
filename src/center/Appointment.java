/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package center;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author DELL - USER
 */
public class Appointment  extends Doctor
{

private Patient patient;
private String desc;
private Schedule schedule;

    public Appointment() {
    }

    public Appointment(Patient patient, String desc, int dnum, String dname, String specialty, String dphoneNum) {
        super(dnum, dname, specialty, dphoneNum);
        this.patient = patient;
        this.schedule=schedule;
        this.desc = desc;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return (
                "Patient Name :" + patient.getName()
                + super.toString()
                
                
                );
    }
        public void displayAppointmentsInfo( ) {

        System.out.println("Patient name : " + patient.getName());
        System.out.println("Doctor name : " + getdName());
        System.out.println("Day : " + schedule.getDay());
        System.out.println("Time : " + schedule.getTime());
    }

    


}
