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
public class AppChiro extends Appointment {

     //durée par défaut (20 min) ou durée spécifique

    public AppChiro(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException{

        super(patient, doc, d, m, y, hour, min, dur);

    }

    public AppChiro(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException{

        super(patient, doc, d, m, y, hour, min);
        duration = 45;

    }

    public String toString() {

        String retour;
        retour = super.toString();
        retour = retour + ", duration: " + duration + " min";
        return retour;

    }
    
    public static AppChiro newAppointment() throws AppException {
        
        int dur = 0;

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

        System.out.println("The default duration is 45 minutes. Do you want an other duration ? (yes / no)");
        String ret = sc.next();
        if (ret.equals("yes")) {
            System.out.println("Enter the new duration : ");
            dur = sc.nextInt();
        } else if (ret.equals("no")) {
            dur = 45;
        }

        AppChiro app = new AppChiro(patient, doctor, day, month, year, hour, min, dur);
        System.out.println(app.getClass()); //à retirer, seulement pour vérification
        return app;
    }

}
