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
public abstract class AppCalendar extends TreeSet<App> {     //Peut être viré

    public void checkValidity(App check) throws AppException {

        for (App app : this) {    // rdv qui se chevauchent
            //on compare le rdv app avec le suivant (this.lower(app)) dans la treeset puisqu'ils sont triés par ordre chronologique
            if ((app.getYear() == (this.lower(app)).getYear()) && (app.getMonth() == (this.lower(app)).getMonth()) && (app.getDay() == (this.lower(app)).getDay())) {
                if (app.finalHour(app) > (this.lower(app)).getDebutHour()) {
                    throw new AppException("Two appointements can't take place at the same time");
                } else if ((app.finalHour(app) == (this.lower(app)).getDebutHour()) && (app.finalMin(app) >= (this.lower(app)).getDebutMin())) {
                    throw new AppException("Two appointements can't take place at the same time");
                }
            }
        }
    }

    public String toString() {
        String ret = "";
        System.out.println("Calendar : ");
        for (App app : this) {
            System.out.println(app);
        }
        return ret;
    }

    public abstract void addApp(App a);

    public abstract void delApp(App a);

    public abstract void modApp(App a);

}
