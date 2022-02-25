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

    private String paName;
    private String docName;
    private int debutHour;
    private int debutMin;
    private int year;
    private int month;
    private int day;

    public App(String patient, String doc, int d, int m, int y, int hour, int min) {

        paName = patient;
        docName = doc;
        debutHour = hour;
        debutMin = min;
        year = y;
        month = m;
        day = d;

    }

    public String toString() {
        return "patient: " + paName + ", doctor: " + docName + ", on: " + day + "/" + month + "/" + year + " at: " + debutHour + ":" + debutMin;
    }

    public int compareTo(App o) {
        int ret = 0;
        if (this.year - o.year < 0) {
            ret = -1;
        }
        if (this.year - o.year > 0) {
            ret = 1;
        }
        if (this.year == o.year) {
            if (this.month - o.month < 0) {
                ret = -1;
            }
            if (this.month - o.month > 0) {
                ret = 1;
            }
            if (this.month == o.month) {
                if (this.day - o.day < 0) {
                    ret = -1;
                }
                if (this.day - o.day > 0) {
                    ret = 1;
                }
                if (this.day == o.day) {
                    if (this.debutHour - o.debutHour < 0) {
                        ret = -1;
                    }
                    if (this.debutHour - o.debutHour > 0) {
                        ret = 1;
                    }
                    if (this.debutHour == o.debutHour) {
                        if (this.debutMin - o.debutMin < 0) {
                            ret = -1;
                        }
                        if (this.debutMin - o.debutMin > 0) {
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

    public abstract int finalHour(App a);

    public abstract int finalMin(App a);

    public abstract String finalTime(App a);

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

}
