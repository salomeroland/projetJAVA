/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author salomeroland
 */
public abstract class App { // Classe rendez-vous

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

    public abstract int finalHour(App a) ;
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

 
