/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this rtemplate
 */
package center;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DELL - USER
 */

public class Patient 
{
    static Scanner input=new Scanner(System.in);
    private int num;
    private String name;
    private char gender;
    private BirthDate bDate;
    private String phoneNum;
    private String medRec;

    public Patient() 
    {
        this.num = -1;
        this.name = "Unknown";
        this.gender = 'f';
        this.bDate=new BirthDate();
        this.phoneNum = "Nothing";
        this.medRec = "Nothing";
        
    }

    public Patient(int num, String name, char gender,BirthDate bDate ,String phoneNum, String medRec){

    
//        this.num = num;
//        this.name = name;
//        this.gender = gender;
//        this.bDate=new BirthDate();
//        this.phoneNum = phoneNum;
//        this.medRec = medRec;
          setNum(num);
          setName(name);
          setGender(gender);
          setPhoneNumber(phoneNum);
          setMedicalRecord(medRec);
     
    }
 public Patient(int num, String name, char gender,int year,int month ,String phoneNum, String medRec){

    
        this.num = num;
        this.name = name;
        this.gender = gender;
        this.bDate=new BirthDate(year, month);
        this.phoneNum = phoneNum;
        this.medRec = medRec;
 }
    public int getNum() {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public String getName()
    {
        
        return name;
    }

    public void setName(String name) {
    String arr[]=name.split(" ");
      if(arr.length>=2)
        this.name = name;
      else
          this.name="Unknown";
        
    }
    public void setName()
    {
        System.out.println("Enter Patient Name : ");   
        String name=input.next();
        this.name=name;
    }

        public char getGender() {
        return gender;
    }

    public void setGender(char gender) 
    {
        switch(gender){
            case 'F':       case 'f':
            case 'M':       case 'm':
                this.gender = gender;
         break;
         default:
             this.gender = 'f';
             break;
        }
    }
    public String getGenderAsString() 
    {
     switch(gender){
            case 'F':       case 'f':
                return "Female";
            case 'M':       case 'm':
                return "Male";
                default:
                    return "Female";
     }
    }

    public BirthDate getbDate() {
        return bDate;
    }

    public void setbDate(BirthDate bDate) {
        this.bDate = bDate;
    }
  
    public void setbDate(int Year,int Month) 
    {
        this.bDate.setYear(Year); 
        this.bDate.setMonth(Month);
    }
    public String getFullbDate()
    {
    return bDate.getYear()+" - "+bDate.getMonth();
    }
    public String getPhoneNumber()
    {
        return phoneNum;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        if (phoneNumber.matches("\\d{10}")) {
        this.phoneNum = phoneNumber;
    } else {
         this.phoneNum = "Nothing";

    }
        
    }
    public String getMedicalRecord() {
        return medRec;
    }

    public void setMedicalRecord(String medRec) {
        this.medRec = medRec;
    }
        

    
    public String toString() {
        return (
                
                "Number : "+num
                +"\nName : "+name
                +"\nGender : "+gender
                +"\nGender (String): "+getGenderAsString()
                +"\nBirthdate year : "+bDate.getYear()
                +"\nBirthdate month : "+bDate.getMonth()
                +"\nAge : "+bDate.getAge()
                +"\nFull Birthdate : "+getFullbDate()
                +"\nPhone Number : "+phoneNum
                +"\nMedical Record : "+medRec
                
                
                ); 
    }
    public static void printTableHeader()
     {
     
    System.out.printf("%-10s%-25s%-15s%-20s%10s%20s%26s%n",
                      "num", "name", "gender", "GenderAsString", "b-Date", "phone Number", "medical Record");
}
  
    
 public void printPatientAsFormatedRow() {
    System.out.printf("%-10d%-25S%-15c%-20S%10s%15s%25S%n",
                      num, name, gender, getGenderAsString(), getFullbDate(),phoneNum, medRec);
}

}
