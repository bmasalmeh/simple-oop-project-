/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package center;

import java.util.Calendar;

/**
 *
 * @author DELL - USER
 */
public class BirthDate {

    private int year;
    private int month;    
    
    public BirthDate() {
        this.year = Calendar.getInstance().get(Calendar.YEAR) - 16;
        this.month = 1;
    }
    
    public BirthDate(int year, int month) {
//        this.year = year;
//        this.month = month;
        setMonth(month);
        setYear(year);
        
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        int cy = Calendar.getInstance().get(Calendar.YEAR);
        if (year >= cy - 40 && year <= cy - 16) {
            this.year = year;
        } else {
            this.year = Calendar.getInstance().get(Calendar.YEAR) - 16;
        }
        
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }
    
    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }
    
    public String toString() {
        return ("Year: " + year
                + "\nMonth: " + month
                + "\nAge: " + getAge());        
    }
    
}
