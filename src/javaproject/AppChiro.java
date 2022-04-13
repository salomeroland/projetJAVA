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
        retour = "Chiropractor appointement [ " +retour + ", duration: " + duration + " min" + "]";
        return retour;

    }
    
}
