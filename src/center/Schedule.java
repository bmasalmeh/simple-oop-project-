/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package center;

/**
 *
 * @author DELL - USER
 */
public class Schedule
{
private String day;
private String time;
    
    
    public Schedule() 
    {
     
        this.day = "sunday";
        this.time = "00";
    }

    public Schedule(String day, String time) {
        this.day = day;
        this.time = time;
    }

    


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   
//      public String displayInfo() 
//        {
//            return  "Number:" +getdNum()+ ",Dr.Name: " + getdName() + ", Days: " + day+ ",Times: " + time;
//        } 
//
//    @Override
//    public String toString() {
//        return (  "Number:" +getdNum()+ ",Dr.Name: " + getdName() + ", Days: " + day+ ",Times: " + time
//        
//        
//        
//        ); 
//    }
      
      
}
