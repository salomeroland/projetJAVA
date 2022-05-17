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

    public String toString() {
        return "patient: " + paName + ", doctor: " + docName + ", on: " + day + "/" + month + "/" + year + " at: " + debutHour + ":" + debutMin;
    }

    public static Appointment newAppointment() throws AppException {

        int dur = 0;
        Appointment app = null;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Creation of a new appointment");
        System.out.println("Do you want to take an appointemetn with a physician, a dentist or a chiropractor ?");
        String profession = sc.next();
        while (!(profession.equals("chiropractor") || profession.equals("physician") || profession.equals("dentist"))) {
            System.out.println("You have to choose a profession between physician, chiroprator or dentist");
            System.out.println("Who do you want to take an appointemetn with ?");
            String professionCorrecte = sc.next();
            profession = professionCorrecte;
        }

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

        switch (profession) {
            case "physician": {
                System.out.println("The default duration is 20 minutes. Do you want an other duration ? (yes / no)");
                String ret = sc.next();
                if (ret.equals("yes")) {
                    System.out.println("Enter the new duration : ");
                    dur = sc.nextInt();
                } else if (ret.equals("no")) {
                    dur = 20;
                }
                app = new AppPhys(patient, doctor, day, month, year, hour, min, dur);
                System.out.println(app);
                break;
            }
            case "dentist": {
                System.out.println("The default duration is 30 minutes. Do you want an other duration ? (yes / no)");
                String ret = sc.next();
                if (ret.equals("yes")) {
                    System.out.println("Enter the new duration : ");
                    dur = sc.nextInt();
                } else if (ret.equals("no")) {
                    dur = 30;
                }
                app = new AppDent(patient, doctor, day, month, year, hour, min, dur);
                System.out.println(app);
                break;
            }
            case "chiropractor": {
                System.out.println("The default duration is 45 minutes. Do you want an other duration ? (yes / no)");
                String ret = sc.next();
                if (ret.equals("yes")) {
                    System.out.println("Enter the new duration : ");
                    dur = sc.nextInt();
                } else if (ret.equals("no")) {
                    dur = 45;
                }
                app = new AppChiro(patient, doctor, day, month, year, hour, min, dur);
                System.out.println(app);
                break;
            }

        }

        return app;
    }

    public boolean isCompatible(Calendar cal) throws AppException {
        // app est un rdv du carnet
        // check est le rdv à tester avant de pouvoir l'intégrer au carnet

        boolean compatible = true; //drapeau pour tester la compatibilité du rdv avec le reste du calendrier
        for (Appointment app : cal) {
            if ((app.getYear() == this.getYear()) && (app.getMonth() == this.getMonth()) && (app.getDay() == this.getDay())) {
                if (app.finalHour(app) > this.getDebutHour()) { //l'heure de fin de app dépasse le début de check
                    compatible = false;
                } else if (this.finalHour(app) > app.getDebutHour()) { //l'heure de  fin de check dépasse le début de app
                    compatible = false;
                } else if (app.finalHour(app) == this.getDebutHour()) {  // app et check sont placés sur la même heure
                    if (app.finalMin(app) >= this.getDebutMin()) {  //la minute de fin de app est supérieure à la minute de début de check
                        compatible = false;
                    } else if (this.finalMin(app) >= app.getDebutMin()) {  //la minute de fin de check est supérieure à la minute de début de app
                        compatible = false;
                    }
                }
            }
            if (compatible = false) {
                throw new AppException("Two appointments can't take place at the same time");
            }
        }
        return compatible;
    }

    public int compareTo(Appointment o) {
        int ret = 0;
        if (this.year - o.year < 0) {
            ret = -1;
        } else if (this.year - o.year > 0) {
            ret = 1;
        } else if (this.year == o.year) {
            if (this.month - o.month < 0) {
                ret = -1;
            } else if (this.month - o.month > 0) {
                ret = 1;
            } else if (this.month == o.month) {
                if (this.day - o.day < 0) {
                    ret = -1;
                } else if (this.day - o.day > 0) {
                    ret = 1;
                } else if (this.day == o.day) {
                    if (this.debutHour - o.debutHour < 0) {
                        ret = -1;
                    } else if (this.debutHour - o.debutHour > 0) {
                        ret = 1;
                    } else if (this.debutHour == o.debutHour) {
                        if (this.debutMin - o.debutMin < 0) {
                            ret = -1;
                        } else if (this.debutMin - o.debutMin > 0) {
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

    public static void main(String[] args) throws AppException {
        Appointment app = Appointment.newAppointment();
        System.out.println(app.getClass());
        if (app instanceof AppDent) {
            AppDent ad = (AppDent) app;
        }
    }
}
