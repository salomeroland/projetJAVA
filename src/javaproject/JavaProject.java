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
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // rdv Phys
        App rdv1 = new AppPhys("Lo", "Saint", 24, 10, 2014, 9, 30);
        System.out.println(rdv1);
        System.out.println(rdv1.finalTime(rdv1));
        
        // rdv Dent + calendrier Dent
        AppCalDent calDent = new AppCalDent();     //création calendrier
        AppDent rdvDent1 = new AppDent("Calmettes", "Charon", 10, 5, 2020, 9, 30);
        System.out.println(rdvDent1);    //affiche rdv1
        AppDent rdvDent2 = new AppDent("Pistre", "Sombart", 14, 3, 2021, 8, 20, 28);
        System.out.println(rdvDent2);   //affiche rdv2
        System.out.println(rdvDent2.finalTime(rdvDent2));   //heure de fin rdv2
        calDent.addApp(rdvDent1);   //ajout des rdvs au calendrier
        calDent.addApp(rdvDent2);
        System.out.println(calDent);    //affiche calendrier
//        calDent.modApp(rdvDent);      //modifier calendrier
//        System.out.println(calDent);      //affiche calendrier modifié
    }
    
}
