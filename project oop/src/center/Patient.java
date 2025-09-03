/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this rtemplate
 */
package center;

/**
 *
 * @author DELL - USER
 */
public class Patient 
{
    private int num;
private String name;
private int age;
private char gender;
private String skinType;

    public Patient() 
    {
        this.num = 0;
        this.name = "Unknown";
        this.gender = 'f';
        this.age = 17;
        this.skinType = "Normal";
    }

    public Patient(int num,String name, char gender, int age, String skinType)
    {
        //this.num = num;
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.skinType = skinType;
        setNum(num);
          setName(name);
          setAge(age);
          setGender(gender);
          setSkinType(skinType);
          
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
      String arr[]=name.split(" ");
      if(arr.length>=2)
        this.name = name;
      else
          this.name="Unknown";
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
    public int getAge() {
        return age;
    }

    public void setAge(int age) 
    {
       if(age>=17) 
        this.age = age;
       else
        this.age = 17;   
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType)
    {
        switch(skinType){
            case "Normal":  case "Dry":
            case "Oily":    case "Sensitive":    
        this.skinType = skinType;
        break;
        default:
            this.skinType = "Normal";
            break;
        }
    }

    
    public String toString() {
        return (
                "Number: " +num
                +"\nName: " +name
                +"\nAge: " +age
                +"\nGender: " +gender
                +"\nGender (String): " +getGenderAsString()
                +"\nSkin type: " +skinType); 
        
        
        
    }
    public static void printTableHeader() 
      {
          System.out.printf("%-7S%-30S%-20S%-25S%-15S%-15S%n",
                  "num","Name","Age","Gender(String)","Gender","Skin type");  
    }
    public  void printPatientAsFormatedRow() 
      {
          System.out.printf("%-7d%-30S%-20d%-25S%-15S%-15S%n",
                 num, name,age,getGenderAsString(),gender,skinType);  
    } 
    

}
