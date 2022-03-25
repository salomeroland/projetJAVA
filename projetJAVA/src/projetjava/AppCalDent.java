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
public class AppCalDent extends AppCalendar{

    protected TreeSet<AppDent> calendarDent;

    public AppCalDent() {

        calendarDent = new TreeSet<AppDent>();

    }
    
    public void addApp(AppDent a) {

        calendarDent.add(a);
        
    }
        public void delApp(AppDent a){
        
        calendarDent.remove(a);
        
    }
}

