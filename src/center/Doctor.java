/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package center;

import java.util.ArrayList;
import java.util.Scanner;

/** @author DELL - USER
 */
public class Doctor
       
{
    static  Scanner input = new Scanner(System.in);             
   private int dnum;
   private String dname;
   private String specialty;
   private String dphoneNum;
    private ArrayList<Schedule> schedules;

    public Doctor() 
    {
        this.dnum = -1;
        this.dname="Unknown";
        this.specialty = "General dermatology";
        this.dphoneNum = "06552342";
        
    }

    public Doctor(int dnum, String dname, String specialty, String dphoneNum) {
        this.dnum = dnum;
        this.dname = dname;
        this.specialty = specialty;
        this.dphoneNum = dphoneNum;
        this.schedules = new ArrayList<>();
    }

 


  public ArrayList<Schedule> getSchedules() {
        return schedules;
    }
  public void addscheduale (){
      Schedule s =new Schedule();
      System.out.println("Enter day  :");
      s.setDay(input.next());
      System.out.println("Enter date  :");
      s.setTime(input.next());
      schedules.add(s);
  }
  public void addscheduale ( Schedule s ){
     
      schedules.add(s);
  }
  
    public int getdNum() {
        return dnum;
    }

    public void setdNum(int dnum) {
        this.dnum = dnum;
    }

    public String getdName() {
        return dname;
    }

    public void setdName(String dname) {
        this.dname = dname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getdPhoneNum() {
        return dphoneNum;
    }

    public void setdPhoneNum(String dphoneNum) {
         if (dphoneNum.matches("\\d{10}")) {
        this.dphoneNum = dphoneNum;
    } else {
         this.dphoneNum = "Nothing";

    }
    }

    
//    public void addTimeSlot(String timeSlot) {
//        this.schedule.add(timeSlot);
//    }
//
//    public void removeTimeSlot(String timeSlot) {
//        this.schedule.remove(timeSlot);
//    }
//    public String displayInfo() 
//        {
//            return "Dr.Name: " + dname + ", Specialty: " + specialty+ ",Schedule: " + schedule;
//        }

    
    public String toString() {
        return ( "number : "+dnum
                +"\nDoctor name : "+dname
                +"\nSpecialty : "+specialty
                +"\nDoctor phone number : "+dphoneNum
                
        
        
        
        ); 
    }
    
    
           
   
   
   
}
