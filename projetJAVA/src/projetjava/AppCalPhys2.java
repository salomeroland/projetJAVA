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
public class AppCalPhys2 extends AppCalendar{

    protected TreeSet<AppPhys> calendarPhys2;

    public AppCalPhys2() {

        calendarPhys2 = new TreeSet<AppPhys>();

    }
    
    public void addApp(AppPhys a) {

        calendarPhys2.add(a);
        
    }
        public void delApp(AppPhys a){
        
        calendarPhys2.remove(a);
        
    }
}

    
