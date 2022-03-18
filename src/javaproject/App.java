/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Doriane Lami
 */
public abstract class App implements Comparable<App> { // Classe rendez-vous
    
    
    //Format date !

    private String paName;
    private String docName;
    private int debutHour;
    private int debutMin;
    private int year;
    private int month;
    private int day;
    protected int duration;
    
    public App(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException {

        if (hour < 8) {  //rdv avant 8h
            throw new AppException("The first appointement of the day starts at 8 AM.");
        }
        if (finalHour((App) this) >= 20) {  //rdv après 20h
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

    public App(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException {

        if (hour < 8) {  //rdv avant 8h
            throw new AppException("The first appointement of the day starts at 8 AM.");
        }
        if (finalHour((App) this) >= 20) {  //rdv après 20h
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
    
    public boolean isCompatible(App check){
        
        boolean compatible = true ; //drapeau pour tester la compatibilité du rdv avec le reste du calendrier
        for (App app : this) {
            if ((app.getYear() == check.getYear()) && (app.getMonth() == check.getMonth()) && (app.getDay() == check.getDay())) {
                if (app.finalHour(app) > check.getDebutHour()) {
                    compatible = false;
                } else if ((app.finalHour(app) == check.getDebutHour()) && (app.finalMin(app) >= check.getDebutMin())) {
                    compatible = false;
                }
            }
        }
        return compatible;
    }

    public String toString() {
        return "patient: " + paName + ", doctor: " + docName + ", on: " + day + "/" + month + "/" + year + " at: " + debutHour + ":" + debutMin;
    }

    public int compareTo(App o) {
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

//    public abstract int finalHour(App a);
//
//    public abstract int finalMin(App a);
//
//    public abstract String finalTime(App a);
    
    public final int finalHour(App a) {

        int hour = a.getDebutHour();
        int min = a.getDebutMin() + a.getDuration();
        while (min >= 60) {
            hour++;
            min = min - 60;
        }
        return hour;
    }

    public final int finalMin(App a) {

        int min = a.getDebutMin() + a.getDuration();
        while (min >= 60) {
            min = min - 60;
        }
        return min;
    }

    public final String finalTime(App a) {
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
