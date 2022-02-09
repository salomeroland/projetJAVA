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
public class ProjetJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        App rdv1 = new App("Lo", "Saint", 24, 10, 2014, 9, 30); 
        System.out.println(rdv1);
        AppPhys rdvPhys1 = new AppPhys("Calmettes", "Charon", 10, 5, 2020, 9, 30);
        System.out.println(rdvPhys1);
        AppPhys rdvPhys2 = new AppPhys("Pistre", "Sombart", 14, 3, 2021, 8, 20, 28);
        System.out.println(rdvPhys2);
        System.out.println(rdvPhys1.finalTime(rdvPhys1));
        System.out.println(rdv1.finalTime(rdv1));
    }
    
}
        
    
    

