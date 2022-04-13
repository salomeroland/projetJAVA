/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Doriane Lami
 */
public class CalendarDentist extends TreeSet<AppDent> {

    public CalendarDentist() throws AppException {}

    @Override
    public String toString() {
        String ret = "";
        System.out.println("Calendrier Dentist: ");
        for (Appointment app : this) {
            System.out.println(app);
        }
        return ret;
    }

    public void addApp(AppDent a) throws AppException {
        if (isCompatible(a,this)) {
            this.add(a);
        } 
    }

    public void delApp(AppDent a) throws AppException {
        this.remove(a);
    }

    public void modApp(AppDent a) throws AppException {     // a = rdv qui doit être modifié

        this.delApp(a);     //pour pouvoir modifier un rdv on commence par supprimer sa version originale du calendrier

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("What do you want to modifie ? (practitioner / patient / date / time / duration)");
        String mod = sc.next();
        AppDent ret = null;     // ret = rdv modifié

        switch (mod) {  // on regarde la valeur de mod, et ensuite on va regarder si un cas correspond

            // Modifier praticien
            case ("practitioner"):
                System.out.println("Who is the practitioner ? (Phys1 / Phys2 / Dent / Chiro)");
                String docName = sc.next();
                ret = new AppDent(a.getPaName(), docName, a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin());
                this.addApp(ret);
                break;

            // Modifier le patient
            case ("patient"):
                System.out.println("What is the patient's name ?");
                String paName = sc.next();
                ret = new AppDent(paName, a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin());
                this.addApp(ret);
                break;

            // Modifier la date
            case ("date"):
                System.out.println("What is the year ?");
                int year = sc.nextInt();
                System.out.println("What is the month ?");
                int month = sc.nextInt();
                System.out.println("What is the day ?");
                int day = sc.nextInt();
                ret = new AppDent(a.getPaName(), a.getDocName(), day, month, year, a.getDebutHour(), a.getDebutMin());
                this.addApp(ret);
                break;

            // Modifier l'heure
            case ("time"):
                System.out.println("What is the hour ?");
                int hour = sc.nextInt();
                System.out.println("What is the minute ?");
                int min = sc.nextInt();
                ret = new AppDent(a.getPaName(), a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), hour, min);
                this.addApp(ret);
                break;

            // Modifier la durée
            case ("duration"):
                System.out.println("What duration do you want ?");
                int dur = sc.nextInt();
                ret = new AppDent(a.getPaName(), a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin(), dur);
                this.addApp(ret);
                break;
        }

        // Après une première modif y a-t-il autre chose à changer ?
        System.out.println("Do you want to modifie something else ? (yes / no)");
        String rep = sc.next();
        // Il y a une nouvelle modif
        if (rep.equals("yes")) {
            this.modApp(ret);
        } else { // Pas de nouvelle modif
            System.out.println("Saved appointement : " + ret);
        }
    }
}
