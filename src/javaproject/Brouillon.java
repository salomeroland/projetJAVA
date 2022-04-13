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
public class Brouillon {
    
//        for(App o : calendar){
//            if(o.equals(a)){
//                Scanner sc;
//                sc = new Scanner(System.in);
//                System.out.println("What do you want to modifie ? (practitioner / patient / date / hour / duration)" );
//                String rep = sc.next();
//                if(rep.equals("practitioner")){
//                    delApp(a);
//                    System.out.println("Who is the practitioner ? (Phys1 / Phys2 / Dent / Chiro)");
//                    String name = sc.next();
//                    if(name.equals("Phys1")){
//                        AppPhys newApp = new AppPhys(a.getPaName(), "Phys1", a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin());
//                        
//                    }
//                    
//                    
//                    System.out.println("What do you want to modifie ? (patient / date / hour / duration)");
//                    String mod = sc.next();
//                    if(mod.equals("patient")){
//                        System.out.println("What is the patient's name ?");
//                        String paName = sc.next();
//                        
//                    }
//                }
//                
//        }
//        
//    }
//        for (App o : this) {
//            if (o.equals(a)) {
//                Scanner sc;
//                sc = new Scanner(System.in);
//                System.out.println("Do you want to modifie the practitioner ?");
//                String rep = sc.next();
//                if (rep.equals("yes")) {
//                    delApp(a);
//                    System.out.println("Who is the practitioner ? (Phys1 / Phys2 / Dent / Chiro)");
//                    String name = sc.next();
//                    if (name.equals("Phys1")) {
//                        AppPhys b = (AppPhys) a ;
//                        b.modAppPhys1(b);
//                    }
//                    if (name.equals("Phys2")){
//                        a.modAppPhys2(a);
//                    }
//
//                }else{
//                    
//                }
//
//            }
//        }
    
    
    
    //    public void modApp(AppDent a) {
//        
//        AppDent b = null;
//
//        Scanner sc;
//        sc = new Scanner(System.in);
//
//        System.out.println("What do you want to modify ? (practitioner / patient / date / time / duration)");
//        String mod = sc.next();
//        // Modifier praticien
//        if (mod.equals("practitioner")) {
//            this.remove(a);
//            System.out.println("Who is the practitioner ? (Phys1 / Phys2 / Dent / Chiro)");
//            String docName = sc.next();
//            AppDent newApp = new AppDent(a.getPaName(), docName, a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin(), a.duration);
//            addApp(newApp);
//            b = newApp;
//        }
//        // Modifier le patient
//        if (mod.equals("patient")) {
//            System.out.println("What is the patient's name ?");
//            String paName = sc.next();
//
//            AppDent newApp = new AppDent(paName, a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin(), a.duration);
//            addApp(newApp);
//                        delApp(a);
//            b = newApp;
//        }
//        // Modifier la date
//        if (mod.equals("date")) {
//            System.out.println("What is the year ?");
//            int year = sc.nextInt();
//            System.out.println("What is the month ?");
//            int month = sc.nextInt();
//            System.out.println("What is the day ?");
//            int day = sc.nextInt();
//            delApp(a);
//            AppDent newApp = new AppDent(a.getPaName(), a.getDocName(), day, month, year, a.getDebutHour(), a.getDebutMin(), a.duration);
//            addApp(newApp);
//            b = newApp;
//        }
//        // Modifier l'heure
//        if (mod.equals("time")) {
//            System.out.println("What is the hour ?");
//            int hour = sc.nextInt();
//            System.out.println("What is the minute ?");
//            int min = sc.nextInt();
//            delApp(a);
//            AppDent newApp = new AppDent(a.getPaName(), a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), hour, min, a.duration);
//            addApp(newApp);
//            b = newApp;
//        }
//        // Modifier la durée
//        if (mod.equals("duration")) {
//            System.out.println("What duration do you want ?");
//            int dur = sc.nextInt();
//            delApp(a);
//            AppDent newApp = new AppDent(a.getPaName(), a.getDocName(), a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin(), dur);
//            addApp(newApp);
//            b = newApp;
//        }
//
//        // Après une première modif y a-t-il autre chose à changer ?
//        System.out.println("Do you want to modifie something else ? (yes / no)");
//        String rep = sc.next();
//        // Il y a une nouvelle modif
//        if (rep.equals("yes")) {
//            modApp(a);
//        } else { // Pas de nouvelle modif
//            System.out.println("Saved appointement : " + b);
//}}
    
    
    //    public void checkValidity(Appointment check) throws AppException {
//
//        for (Appointment app : this) {    // rdv qui se chevauchent
//            //on compare le rdv app avec le suivant (this.lower(app)) dans la treeset puisqu'ils sont triés par ordre chronologique
//            if ((app.getYear() == (this.lower(app)).getYear()) && (app.getMonth() == (this.lower(app)).getMonth()) && (app.getDay() == (this.lower(app)).getDay())) {
//                if (app.finalHour(app) > (this.lower(app)).getDebutHour()) {
//                    throw new AppException("Two appointements can't take place at the same time");
//                } else if ((app.finalHour(app) == (this.lower(app)).getDebutHour()) && (app.finalMin(app) >= (this.lower(app)).getDebutMin())) {
//                    throw new AppException("Two appointements can't take place at the same time");
//                }
//            }
//        }
//    }
    //
//    public boolean isCompatible(Appointment check) {
//        // app est un rdv du carnet
//        // check est le rdv à tester avant de pouvoir l'intégrer au carnet
//
//        boolean compatible = true; //drapeau pour tester la compatibilité du rdv avec le reste du calendrier
//        for (Appointment app : this) {
//            if ((app.getYear() == check.getYear()) && (app.getMonth() == check.getMonth()) && (app.getDay() == check.getDay())) {
//                if (app.finalHour(app) > check.getDebutHour()) { //l'heure de fin de app dépasse le début de check
//                    compatible = false;
//                } else if (check.finalHour(app) > app.getDebutHour()) { //l'heure de  fin de check dépasse le début de app
//                    compatible = false;
//                } else if (app.finalHour(app) == check.getDebutHour()) {  // app et check sont placés sur la même heure
//                    if (app.finalMin(app) >= check.getDebutMin()) {  //la minute de fin de app est supérieure à la minute de début de check
//                        compatible = false;
//                    } else if (check.finalMin(app) >= app.getDebutMin()) {  //la minute de fin de check est supérieure à la minute de début de app
//                        compatible = false;
//                    }
//                }
//            }
//        }
//        return compatible;
//    }
    
}
