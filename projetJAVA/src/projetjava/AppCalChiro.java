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
public class AppCalChiro extends AppCalendar {

    protected TreeSet<AppChiro> calendarChiro;

    public AppCalChiro() {

        calendarChiro = new TreeSet<AppChiro>();

    }


    public void addApp(AppChiro a) {

        calendarChiro.add(a);

    }

    public void delApp(AppChiro a) {

        calendarChiro.remove(a);

    }
}

