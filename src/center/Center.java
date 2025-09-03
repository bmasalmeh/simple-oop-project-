/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package center;

import java.util.ArrayList;
import java.util.Scanner;
import center.Medication;

/**
 *
 * @author DELL - USER
 */
public class Center {

    static Scanner input = new Scanner(System.in);
    private static ArrayList<Appointment> list2;
    private static Medication medication;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Appointment a = new Appointment();
        ArrayList<Patient> list = new ArrayList<>();
        ArrayList<Medication> medications = new ArrayList<>();
        Medication m = new Medication();
        list.add(new Patient(1, "bushra emad masalmeh", 'f', 2003, 2, "0796554343", "fjlgldfg"));
        list.add(new Patient(0, "Malk emad masalmeh", 'f', 2004, 4, "0796554343", "fjlgldfg"));
        list.add(new Patient(2, "ALla emad masalmeh", 'm', 2005, 9, "0796554343", "fjlgldfg"));

        Doctor doctor = new Doctor(1, "Dr.Ahmad Mouhammd", "Cardiology", "0796554343");
        doctor.addscheduale(new Schedule("Sunday", "9:00"));
        doctor.addscheduale(new Schedule("Monday", "10:00"));
        doctor.addscheduale(new Schedule("Wensday", "11:00"));
        doctor.addscheduale(new Schedule("Tuesday", "13:00"));
        medications.add(new Medication(1, "Paracetamol", 500, "Every 8 hours"));
        medications.add(new Medication(2, "Medication 2", 10, "Twice a day"));
        medications.add(new Medication(3, "Medication 3", 20, "Once a day"));

        //        System.out.println(medication.getMedicineInfo());
        Welcoming();
        char Choice;
        do {
            drawMenu();
            Choice = Character.toLowerCase(input.next().charAt(0));
            switch (Choice) {
                case 'a':
                    System.out.println("-------------------------------");
                    System.out.println("** Add new Patient **");
                    System.out.println("** Please Enter Patient Info **");
                    addPatient(list);
                    System.out.println("-------------------------------");
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
                case 'o':
                    System.out.println("----------------------");
                    System.out.println("** Sort by: **");
                    char medicationChoice;
                    do {
                      drawMenu2();
                        medicationChoice = Character.toLowerCase(input.next().charAt(0));
                        switch (medicationChoice) {
                            case 'n':
                                System.out.println("**Sort by Number**");
                                sortbynumber(list);
                                break;
                            case 'm':

                                System.out.println("**Sort by Name**");
                                sortbyname(list);
                                break;

                            case 'b':
                                System.out.println("**Back** ");
                                // يعود إلى القائمة الرئيسية
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (medicationChoice != 'b');

                    break;
                case 'p':
                    System.out.println("-------------------------------");
                    System.out.println("** Print all Patient **");
                    System.out.println("** Please Enter Patient Info **");
                    printAllPatient(list);
                    System.out.println("-------------------------------");
                    break;

                case 'c':
                    System.out.println("-------------------------------");
                    System.out.println("** Doctor appointment schedule **");
                    displayAppointments(doctor);
                    //System.out.println(doctor);
                    System.out.println("** This is the schedule for today **");
                    System.out.println("------------------------------------");

                    break;
                case 'm':

                    do {
                        drawMedicationMenu();
                        medicationChoice = Character.toLowerCase(input.next().charAt(0));
                        switch (medicationChoice) {
                            case 'a':
                                // إضافة دواء 
                                System.out.println("------------------------------");
                                System.out.println("** Add medication **");
                                System.out.println("** Please Enter Med Info **");
                                m.addMedication(medications);
                                System.out.println("-------------------------------");
                                break;
                            case 'p':
                                // طباعة جميع الأدوية
                                System.out.println("---------------------------");
                                System.out.println("** Print all medications **");
                                m.printAllMedication(medications);
                                System.out.println("---------------------------");
                                break;
                            case 'd':
                                // حذف دواء
                                System.out.println("-------------------------");
                                System.out.println("** Delete a medication **");
                                m.deleteMedication(medications);
                                System.out.println("-------------------------");
                                break;
                            case 'u':
                                // تحديث دواء
                                System.out.println("-------------------------");
                                System.out.println("** Update a medication **");
                                m.updateMedication(medications);
                                System.out.println("-------------------------");
                                break;
                            case 'b':
                                // يعود إلى القائمة الرئيسية
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    } while (medicationChoice != 'b');
                    break;
                case 'i':
                    System.out.println("----------------------------");
                    System.out.println("I-Appointment Info");
//                        displayAppointmentsInfo(patient, appointment, schedule);
                    a.displayAppointmentsInfo();
                    System.out.println("----------------------------");
                    break;
                case 'e':
                    System.out.println("----------------------------");
                    System.out.println(" ** You Ended the program **");
                    System.out.println(" || Thank You :) ||");

                    break;
                default:
                    System.out.println("----------------------------");
                    System.out.println(" ** Wrong choice , try again **");
                    System.out.println("----------------------------");
                    break;
            }
        } while (Choice != 'w');

    }

    public static void drawMenu() {
        System.out.println("What do you want:");
        System.out.println("A- Add new Patient");
        System.out.println("D- To Delete a Patient");
        System.out.println("U- To Update a Patient");
        System.out.println("S- TO Search a Number Patient");
        System.out.println("O-Sort by: ");
        System.out.println("P- Print All Patient");
        System.out.println("C- Schedule for the Doctor :");
        System.out.println("M- Medication");
       // System.out.println("R-Appointment Info");
        System.out.println("E- To Exit");
        System.out.println("Enter your Choice:");

    }

    public static void drawMedicationMenu() {
        System.out.println("What do you want:");
        System.out.println("A- Add medication");
        System.out.println("P- Print All medication");
        System.out.println("D- To Delete a medication");
        System.out.println("U- To Update a medication");
        System.out.println("b- <<<Back>>>");
        System.out.println("Enter your Choice:");

    }

    public static void drawMenu2() {
        System.out.println("Sort by:");
        System.out.println("N- Sort by Number");
        System.out.println("M- Sort by Name");
         System.out.println("b- <<<Back>>>");
    }

    public static void addPatient(ArrayList<Patient> list) {
        Patient p = new Patient();
        System.out.println("Enter Patient Number:");
        p.setNum(input.nextInt());
        System.out.println("Enter Patient Name:");
        input.nextLine();
        p.setName(input.nextLine());
        System.out.println("Enter Patient Gender(m,f):");
        p.setGender(input.next().charAt(0));
        System.out.println("Enter Patient year of birth:");
        int y = input.nextInt();

        System.out.println("Enter Patient month of birth:");
        int m = input.nextInt();
        //System.out.println("Enter Patient Full Birthdate: ");
        p.setbDate(y, m);

        System.out.println("Enter Patient phone number: ");
        p.setPhoneNumber(input.next());
        System.out.println("Enter Patient Medical Record:");
        p.setMedicalRecord(input.next());

        list.add(p);
        System.out.println("----------------------------------");
        System.out.println("** A new patient has been added **");
        //System.out.println("** Please Enter Patient Info **");

    }

    public static void printAllPatient(ArrayList<Patient> list) {
        Patient.printTableHeader();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printPatientAsFormatedRow();
        }
        System.out.println(" ");
    }

    public static void deletePatient(ArrayList<Patient> list) {
        boolean done = false;
        System.out.println("Enter Patient Number you want To Delete:");
        int x = input.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNum() == x) {
                list.remove(i);
                done = true;
            }
        }
        if (done) {
            System.out.println("Patient is deleted')");
            System.out.println("-----------------");
        } else {
            System.out.println("Patient is not found,no Patient is deleted!");
            System.out.println("-------------------------------------");
        }
    }

    public static void updatePatient(ArrayList<Patient> list) {
        boolean done = true;
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
                System.out.println("Enter Patient Gender(m,f):");
                p.setGender(input.next().charAt(0));
                System.out.println("Enter Patient year of birth:");
                int y = input.nextInt();

                System.out.println("Enter Patient month of birth:");
                int m = input.nextInt();
                // System.out.println("Enter Patient Full Birthdate: ");
                p.setbDate(y, m);
                System.out.println("Enter Patient phone number: ");
                p.setPhoneNumber(input.next());
                System.out.println("Enter Patient Medical Record:");
                p.setMedicalRecord(input.next());

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

    public static void searchByNumber(ArrayList<Patient> list) {
        boolean found = true;
        System.out.println("Enter Patient number :");
        int n = input.nextInt();
        System.out.println("------------------");
        Patient.printTableHeader();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getNum() == n) {
                list.get(i).printPatientAsFormatedRow();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("not found :( ");
        }

    }

    public static void Welcoming() {

        System.out.println("**************************************");
        System.out.println("Welcome to our center");
        System.out.println("**************************************");
    }

    public static void displayAppointments(Doctor doctor) {
        System.out.println("Available appointments for " + doctor.getdName() + ":");
        for (int i = 0; i < doctor.getSchedules().size(); i++) {
            Schedule schedule = doctor.getSchedules().get(i);
            System.out.println((i + 1) + ". " + schedule.getDay() + " at " + schedule.getTime());
        }
        System.out.println("Enter the number of the appointment you want to choose:");
        int choice = input.nextInt();
        Schedule chosenSchedule = doctor.getSchedules().get(choice - 1);
        System.out.println("You have chosen the appointment on " + chosenSchedule.getDay() + " at " + chosenSchedule.getTime());

    }

//    public static void displayAppointmentsInfo(Patient patient, Appointment appointment, Schedule schedule) {
//
//        System.out.println("Patient name : " + patient.getName());
//        System.out.println("Doctor name : " + appointment.getdName());
//        System.out.println("Day : " + schedule.getDay());
//        System.out.println("Time : " + schedule.getTime());
//    }
    public static void sortbynumber(ArrayList<Patient> list) {
        for (int i = 0; i < list.size()- 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getNum()> list.get(j).getNum()) {
                    Patient temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }

            }

        }
    }

    public static void sortbyname(ArrayList<Patient> list) {
        for (int i = 0; i < list.size()- 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getName().compareToIgnoreCase(list.get(i).getName()) <0) {
                    Patient temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }

            }

        }

    }

}
