/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.TreeSet;

/**
 *
 * @author Doriane Lami
 */
public abstract class Calendar extends TreeSet<Appointment> {     //Peut être viré

//    public void checkValidity(Appointment check) throws AppException {
//
//        for (Appointment app : this) {    // rdv qui se chevauchent
//            //on compare le rdv app avec le suivant (this.lower(app)) dans la treeset puisqu'ils sont triés par ordre chronologique
//            if ((app.getYear() == (this.lower(app)).getYear()) && (app.getMonth() == (this.lower(app)).getMonth()) && (app.getDay() == (this.lower(app)).getDay())) {
//                if (app.finalHour(app) > (this.lower(app)).getDebutHour()) {
//                    throw new AppException("Two appointements can't take place at the same time");
//                } else if ((app.finalHour(app) == (this.lower(app)).getDebutHour()) && (app.finalMin(app) >= (this.lower(app)).getDebutMin())) {
//                    throw new AppException("Two appointements can't take place at the same time");
//                }
//            }
//        }
//    }
    public boolean isCompatible(Appointment check) {
        // app est un rdv du carnet
        // check est le rdv à tester avant de pouvoir l'intégrer au carnet

        boolean compatible = true; //drapeau pour tester la compatibilité du rdv avec le reste du calendrier
        for (Appointment app : this) {
            if ((app.getYear() == check.getYear()) && (app.getMonth() == check.getMonth()) && (app.getDay() == check.getDay())) {
                if (app.finalHour(app) > check.getDebutHour()) { //l'heure de fin de app dépasse le début de check
                    compatible = false;
                } else if (check.finalHour(app) > app.getDebutHour()) { //l'heure de  fin de check dépasse le début de app
                    compatible = false;
                } else if (app.finalHour(app) == check.getDebutHour()) {  // app et check sont placés sur la même heure
                    if (app.finalMin(app) >= check.getDebutMin()) {  //la minute de fin de app est supérieure à la minute de début de check
                        compatible = false;
                    } else if (check.finalMin(app) >= app.getDebutMin()) {  //la minute de fin de check est supérieure à la minute de début de app
                        compatible = false;
                    }
                }
            }
        }
        return compatible;
    }

    public void verification(Appointment check) throws AppException {
        if (!isCompatible(check)) {
            throw new AppException("Two appointments can't take place at the same time");
        }
    }

    public String toString() {
        String ret = "";
        System.out.println("Calendar : ");
        for (Appointment app : this) {
            System.out.println(app);
        }
        return ret;
    }

    public void addApp(Appointment a) throws AppException {
        if (isCompatible(a)) {
            this.add(a);
        } else {
            throw new AppException("Two appointments can't take place at the same time");
        }
    }

    public abstract void delApp(Appointment a) throws AppException;

    public abstract void modApp(Appointment a) throws AppException;

}
