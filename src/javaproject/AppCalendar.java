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
public abstract class AppCalendar extends TreeSet<App> {

//       protected TreeSet<App> calendar;  
//    public AppCalendar() {
//
//        calendar = new TreeSet<App>();  
//
//    }
//    public String toString() {
//        return "Calendar : " + this + "/n";
//    }
    
    public AppCalendar() throws AppException {
        for (App app : this) {
            if (app.getDebutHour() < 8) {  //rdv avant 8h
                throw new AppException("The first appointement of the day starts at 8 AM");
            }
            if (app.finalHour(app) >= 20) {  //rdv après 20h
                throw new AppException("The last appointement of the day ends at 8 PM");
            }
        }
    }

    public String toString() {
        String ret = "";
        System.out.println("Calendrier : ");
        for (App app : this) {
            System.out.println(app);
        }
        return ret;
    }

    public abstract void addApp(App a);

    public abstract void delApp(App a);

    public abstract void modApp(App a);

}
