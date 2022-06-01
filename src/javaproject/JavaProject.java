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
     * @throws javaproject.AppException
     */
    public static void main(String[] args) throws AppException {
        
        //Création des carnets de rdv
        
        CalendarDentist calDent = new CalendarDentist();  
        CalendarPhysician calPhys = new CalendarPhysician();  
        CalendarChiro calChiro = new CalendarChiro();  

        // rdv Phys
//        AppPhys rdv1 = new AppPhys("Lo", "Saint", 24, 10, 2014, 21, 30);
//        System.out.println(rdv1);
//        System.out.println(rdv1.finalTime(rdv1));
//        // rdv Dent + calendrier Dent
   //création calendrier
//        AppDent rdvDent1 = new AppDent("Calmettes", "Charon", 10, 3, 2021, 9, 20);
//        System.out.println(rdvDent1);    //affiche rdv1
////        System.out.println(rdvDent1.finalTime(rdvDent1));   //heure de fin rdv1
////        
//        AppDent rdvDent2 = new AppDent("Pistre", "Sombart", 10, 3, 2021, 9, 10, 20);
//        System.out.println(rdvDent2);   //affiche rdv2
//        System.out.println(rdvDent2.finalTime(rdvDent2));   //heure de fin rdv2
//        calDent.addApp(rdvDent1);   //ajout des rdvs au calendrier
//        calDent.addApp(rdvDent2);
//        System.out.println(calDent);    //affiche calendrier
//        calDent.modApp(rdvDent);      //modifier calendrier
//        System.out.println(calDent);      //affiche calendrier modifié

//        AppDent app = AppDent.newAppointment();
//        System.out.println(app);
//        calDent.addApp(AppDent.newAppointment());


// Création d'un rdv en interaction (entrées clavier)
        Appointment app = Appointment.newAppointment();
        System.out.println(app.getClass());  
        if (app instanceof AppDent) {
            AppDent ad = (AppDent) app;
            calDent.addApp(ad);
        }
        else if (app instanceof AppPhys){
            AppPhys ad = (AppPhys) app;
            calPhys.addApp(ad);
        }
        else if (app instanceof AppChiro){
            AppChiro ad = (AppChiro) app;
            calChiro.addApp(ad);
        }
        
//        System.out.println(calDent);
        
       
//        User.register("Francis","12345");
//        User.login("Francis","12345");
    }

}
