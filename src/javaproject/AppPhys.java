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
public class AppPhys extends App { //Rendez-vous généraliste


    //durée par défaut (20 min) ou durée spécifique

    public AppPhys(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException{

        super(patient, doc, d, m, y, hour, min, dur);

    }

    public AppPhys(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException{

        super(patient, doc, d, m, y, hour, min);
        duration = 20;
        
    }

    public String toString() {

        String retour;
        retour = super.toString();
        retour = retour + ", duration: " + duration + " min";
        return retour;

    }

}
