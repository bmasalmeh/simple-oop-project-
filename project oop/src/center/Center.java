/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package center;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL - USER
 */
public class Center {

    static Scanner input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    ArrayList<Patient> list= new ArrayList<> ();
    list.add(new Patient(1,"Batool Masalmeh", 'f', 20, "Oily"));
    list.add(new Patient(2,"Saif", 'm', 15, "Oily"));
    list.add(new Patient(3,"Malk emad", 'w', 18, "Dry"));
         char Choice;
        do {            
            drawMenu();
          Choice=Character.toLowerCase(input.next().charAt(0));
          switch(Choice)
          {
              case 'a':
                  System.out.println("-------------------------------");
                  System.out.println("** Add new Patient **");
                  System.out.println("** Please Enter Patient Info **");
                  addPatient(list);
                  break;
                  case 'd':
                  System.out.println("----------------------");
                  System.out.println("** Delete a Patient **");
                  System.out.println("----------------------");
                      deletePatient(list);
                  break;
                  case 'u':
                  System.out.println("----------------------");
                  System.out.println("** Update a Patient **");
                  System.out.println("----------------------");
                      updatePatient(list);
                  break;
                  case 's':
                  System.out.println("----------------------");
                  System.out.println("** Search a Number Patient **");
                  System.out.println("----------------------");
                      searchByNumber(list);
                  break;
                  case 'p':
                  System.out.println("-------------------------------");
                  System.out.println("** Print all Patient **");
                  System.out.println("** Please Enter Patient Info **");
                      printAllPatient(list);
                  break;
                  case 'e':
                    System.out.println("----------------------------");
                    System.out.println(" ** You Ended the program **");
                    System.out.println(" || Thank You :) ||");

                    break;
                default:
                    System.out.println("----------------------------");
                    System.out.println(" ** You Ended the program **");
                    System.out.println(" || Thank You :) ||");
                    System.out.println("----------------------------");
                    break;
          }
        } while (Choice !='w');
    
            }
    public static void drawMenu() {
        System.out.println("Welcome to our Center!");
        System.out.println("What do you want:");
        System.out.println("A- Add new Patient");
        System.out.println("P- Print All Patient");
        System.out.println("D- To Delete a Patient");
        System.out.println("U- To Update a Patient");
        System.out.println("S- TO Search a Number Patient");
        System.out.println("E- To Exit");
        System.out.println("Enter your Choice:");

    }
    public static void addPatient(ArrayList<Patient> list) 
    {
     Patient p=new Patient();
        System.out.println("Enter Patient Number:");
        p.setNum(input.nextInt());
        System.out.println("Enter Patient Name:");
        input.nextLine();
        p.setName(input.nextLine());
        System.out.println("Enter Patient Age:");
        p.setAge(input.nextInt());
        System.out.println("Enter Patient Gender(m,f):");
        p.setGender(input.next().charAt(0));
        System.out.println("Enter Patient Skin type:");
        p.setSkinType(input.next());
        
        list.add(p);
        System.out.println("----------------------------------");
        System.out.println("** A new patient has been added **");
        //System.out.println("** Please Enter Patient Info **");
        
    }
    public static void printAllPatient(ArrayList<Patient> list)
    {
    Patient.printTableHeader();
        for (int i = 0; i <list.size(); i++) {
          list.get(i).printPatientAsFormatedRow();
        }
        System.out.println(" ");
    }
    public static void deletePatient(ArrayList<Patient> list) {
        boolean done = false;
        System.out.println("Enter Patient Number you want To Delete:");
        int x = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum()== x) {
                list.remove(i);
                done = true;
            }
        }
           if(done) {
            System.out.println("Patient is deleted')");
            System.out.println("-----------------");
           }
           else {
            System.out.println("Patient is not found,no Patient is deleted!");
            System.out.println("-------------------------------------");
        }
}
    

    public static void updatePatient(ArrayList<Patient> list) {
        boolean done = false;
        System.out.println("Enter Patient Number you want To Update:");
        int x = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == x) {
                Patient.printTableHeader();
                list.get(i).printPatientAsFormatedRow();
                System.out.println("-------------------------------");
                Patient p = new Patient();
                System.out.println("Enter Patient Number:");
                p.setNum(input.nextInt());
                System.out.println("Enter Patient Name:");
                input.nextLine();
                p.setName(input.nextLine());
                System.out.println("Enter Patient Age:");
                p.setAge(input.nextInt());
               System.out.println("Enter Patient Gender(m,f):");
                p.setGender(input.next().charAt(0));
                System.out.println("Enter Patient Skin type:");
                p.setSkinType(input.next());

                list.set(i, p);
                done = true;
                System.out.println("Patient is Update')");
                System.out.println("-----------------");
            }

            if (done == false) {
                System.out.println("Patient is not found,no Patient is Update!");
                System.out.println("-------------------------------------");
            }

        }
    }
    //This method it's for search by name but it's dosen't work, idk why :(    مع انه الكود صح ومافي اشي غلط
//    public static void searchByName(ArrayList<Patient> list) 
//    {
//        System.out.println("Enter Patient name :");
//        input.nextLine();
//        String n=input.nextLine();
//        n=n+"";
//        
//        System.out.println("------------------");
//        Patient.printTableHeader();
//        
//        for (int i = 0; i <list.size(); i++)
//        {
//            
//        if(list.get(i).getName().toUpperCase().equalsIgnoreCase(n))
//        {   
//            list.get(i).printPatientAsFormatedRow();
//        }   
//                     
//                      
//       
//    }
//         System.out.println("not found");  
//}
 
    public static void searchByNumber(ArrayList<Patient> list) 
    {
        boolean found = false;
        System.out.println("Enter Patient number :");
        int n=input.nextInt();
        System.out.println("------------------");
        Patient.printTableHeader();
        
        for (int i = 0; i <list.size(); i++)
        {
            
        if(list.get(i).getNum()==n)
        {
            list.get(i).printPatientAsFormatedRow();
            found=true;
            break;
        }
           } 
        if(!found) {
                System.out.println("not found :( ");
         }   

    }
}

