/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package center;

import static center.Center.input;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL - USER
 */
public class Medication 
{
    static Scanner input=new Scanner(System.in);
    ArrayList<Medication> medications=new ArrayList<>();
private int num;
private String name;
private int dosage;
private String freq;

    public Medication() 
    {
        this.num=-1;
        this.name = "Antibiotic";
        this.dosage = 250;
        this.freq = "Every 12 hours";  
    }

    public Medication(int num,String name, int dosage, String freq) {
        //this.num=num;
//        this.name = name;
//        this.dosage = dosage;
//        this.freq = freq;
         setNum(num);
         setName(name);
         setDosage(dosage);
         setFreq(freq);

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

    public void setName(String name) {
        this.name = name;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage)
    {
        if(dosage>0)
        this.dosage = dosage;
        else
        this.dosage = 250;
  
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq)
    {
        
        this.freq = freq;
    }

    public String getMedicineInfo() {
    return "Name: " + name + ",Dosage : " + dosage + ", Frequency: " + freq;
    }
    public static void printTableHeaderMed()
     {
     
    System.out.printf("%-10s%-20s%-25s%-15s%n",
                      "Number","Name","Dosage","Frequency");
     }
  
    
 public void printMedicationAsFormatedRow() {
    System.out.printf("%-10d%-20S%-25d%-15S%n",
                      num,name, dosage, freq);
}
    
    public void addMedication(ArrayList<Medication> medications) 
  {
      Medication m=new Medication();
      System.out.println("Enter Medication number : ");
         m.setNum(input.nextInt());
        System.out.print("Enter the name of the medication : ");
        input.nextLine();
        m.setName(input.nextLine());
        System.out.print("Enter the dosage : ");
        m.setDosage(input.nextInt());
        System.out.print("Enter the frequncy : ");
        input.nextLine();
        m.setFreq(input.nextLine());

        medications.add(m);
        System.out.println("------------------------------------");
        System.out.println("The medicine was added successfully!");
  }
    
        public  void printAllMedication(ArrayList<Medication> medications) {
        Medication.printTableHeaderMed();
        for (int i = 0; i < medications.size(); i++) {
            medications.get(i).printMedicationAsFormatedRow();
        }
        System.out.println(" ");
    }
        public void deleteMedication(ArrayList<Medication> medications) {
        boolean done = false;
        System.out.println("Enter Medication Number you want To Delete:");
        int x = input.nextInt();
        for (int i = 0; i < medications.size(); i++) {
            if (medications.get(i).getNum() == x) {
                medications.remove(i);
                done = true;
            }
        }
        if (done) {
            System.out.println("Medication is deleted')");
            System.out.println("-----------------");
        } else {
            System.out.println("Medication is not found,no Medication is deleted!");
            System.out.println("-------------------------------------");
        }
    }
        public void updateMedication(ArrayList<Medication> medications) {
        boolean done = false;
        System.out.println("Enter Medication Number you want To Update:");
        int x = input.nextInt();
        for (int i = 0; i < medications.size(); i++) {
            if (medications.get(i).getNum() == x) {
                printTableHeaderMed();
                medications.get(i).printMedicationAsFormatedRow();
                System.out.println("-------------------------------");
                Medication m=new Medication();
                System.out.println("Enter Medication number : ");
                m.setNum(input.nextInt());
                System.out.print("Enter the name of the medication : ");
                input.nextLine();
                m.setName(input.nextLine());
                System.out.print("Enter the dosage : ");
                 m.setDosage(input.nextInt());
                System.out.print("Enter the frequncy : ");
                input.nextLine();
                m.setFreq(input.nextLine());

                medications.set(i, m);
                done = true;
                System.out.println("Medication is Update')");
                System.out.println("-----------------");
            }

            if (done == false) {
                System.out.println("Medication is not found,no Medication is Update!");
                System.out.println("-------------------------------------");
            }

        }
    }
}
    

