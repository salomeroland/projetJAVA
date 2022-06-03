/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Scanner;

/**
 *
 * @author Doriane Lami
 */
public class Appointment implements Comparable<Appointment> { // Classe rendez-vous
    //abstract ?
    
    //Format date !

    protected String paName;
    protected String docName;
    protected int debutHour;
    protected int debutMin;
    protected int year;
    protected int month;
    protected int day;
    protected int duration;
    /*
    public Appointment(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException {

        if (hour < 8) {  //rdv avant 8h
            throw new AppException("The first appointement of the day starts at 8 AM.");
        }
        if (finalHour((Appointment) this) >= 20) {  //rdv après 20h
            throw new AppException("The last appointement of the day ends at 8 PM.");
        }

        paName = patient;
        docName = doc;
        debutHour = hour;
        debutMin = min;
        year = y;
        month = m;
        day = d;

    }
*/
    public Appointment(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException {

        if (hour < 8) {  //rdv avant 8h
            throw new AppException("The first appointement of the day starts at 8 AM.");
        }
        if (finalHour((Appointment) this) >= 20) {  //rdv après 20h
            throw new AppException("The last appointement of the day ends at 8 PM.");
        }

        paName = patient;
        docName = doc;
        debutHour = hour;
        debutMin = min;
        year = y;
        month = m;
        day = d;
        duration = dur;

    }

    Appointment(String salomé, String sam, int i, int i0, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString() {
        return "patient: " + paName + ", doctor: " + docName + ", on: " + day + "/" + month + "/" + year + " at: " + debutHour + ":" + debutMin;
    }
    
    public static Appointment newAppointment() throws AppException{
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Creation of a new appointment");
        
        System.out.println("What is the patient's name ?");
        String patient = sc.next();
        
        System.out.println("What is the doctor's name ?");
        String doctor = sc.next();
        
        System.out.println("When will the appointment take place ?");
        System.out.println("year : ");
        int year = sc.nextInt();
        System.out.println("month : ");
        int month = sc.nextInt();
        System.out.println("day : ");
        int day = sc.nextInt();
        System.out.println("When will the appointment start ?");
        System.out.println("hour : ");
        int hour = sc.nextInt();
        System.out.println("minute : ");
        int min = sc.nextInt();
        System.out.println("duration : ");
        int duration = sc.nextInt(); 
        
        Appointment app = new Appointment(patient, doctor, day, month, year, hour, min, duration );
        return app;
    }

    public int compareTo(Appointment o) {
        int ret = 0;
        if (this.year - o.year < 0) {
            ret = -1;
        }
        else if (this.year - o.year > 0) {
            ret = 1;
        }
        else if (this.year == o.year) {
            if (this.month - o.month < 0) {
                ret = -1;
            }
            else if (this.month - o.month > 0) {
                ret = 1;
            }
            else if (this.month == o.month) {
                if (this.day - o.day < 0) {
                    ret = -1;
                }
                else if (this.day - o.day > 0) {
                    ret = 1;
                }
                else if (this.day == o.day) {
                    if (this.debutHour - o.debutHour < 0) {
                        ret = -1;
                    }
                    else if (this.debutHour - o.debutHour > 0) {
                        ret = 1;
                    }
                    else if (this.debutHour == o.debutHour) {
                        if (this.debutMin - o.debutMin < 0) {
                            ret = -1;
                        }
                        else if (this.debutMin - o.debutMin > 0) {
                            ret = 1;
                        } else {    //Cas où == ? deux rdv en même temps donc techniquement impossible  on ne peut pas avoir deux rendez-vous identiques, mais on a besoin que le retour 
                            // par défaut vale 0, lorsqu'on utilise remove, qui compare la valeur qu'on cherche à retirer avec les valeurs du tableau
                            ret = 0;
                        }
                    }
                }
            }
        }
        return ret;
    }

//    public abstract int finalHour(Appointment a);
//
//    public abstract int finalMin(Appointment a);
//
//    public abstract String finalTime(Appointment a);
    
    public final int finalHour(Appointment a) {

        int hour = a.getDebutHour();
        int min = a.getDebutMin() + a.getDuration();
        while (min >= 60) {
            hour++;
            min = min - 60;
        }
        return hour;
    }

    public final int finalMin(Appointment a) {

        int min = a.getDebutMin() + a.getDuration();
        while (min >= 60) {
            min = min - 60;
        }
        return min;
    }

    public final String finalTime(Appointment a) {
        return finalHour(a) + ":" + finalMin(a);

    }

    public int getDebutHour() {
        return debutHour;
    }

    public int getDebutMin() {
        return debutMin;
    }

    public String getPaName() {
        return paName;
    }

    public String getDocName() {
        return docName;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getDuration() {
        return duration;
    }

}
