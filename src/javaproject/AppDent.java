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
public class AppDent extends Appointment {

    //durée par défaut (30 min) ou durée spécifique
    public AppDent(String patient, String doc, int d, int m, int y, int hour, int min, int dur) throws AppException {

        super(patient, doc, d, m, y, hour, min, dur);

    }

    public AppDent(String patient, String doc, int d, int m, int y, int hour, int min) throws AppException {

        super(patient, doc, d, m, y, hour, min);
        duration = 30;

    }

    public String toString() {

        String retour;
        retour = super.toString();
        retour = "Dentist appointement [ " + retour + ", duration: " + duration + " min" + "]";
        return retour;

    }


//    public boolean isCompatible(AppDent check, CalendarDentist cal) throws AppException {
//        // app est un rdv du carnet
//        // check est le rdv à tester avant de pouvoir l'intégrer au carnet
//
//        boolean compatible = true; //drapeau pour tester la compatibilité du rdv avec le reste du calendrier
//        for (AppDent app : cal) {
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
//            if (compatible = false) {
//                throw new AppException("Two appointments can't take place at the same time");
//            }
//        }
//        return compatible;
//    }

}
