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
public class AppCalPhys1 extends AppCalendar{

    protected TreeSet<AppPhys> calendarPhys1;

    public AppCalPhys1() {

        calendarPhys1 = new TreeSet<AppPhys>();

    }
    
    public void addApp(AppPhys a) {

        calendarPhys1.add(a);
        
    }
    
    public void delAppPhys1(AppPhys a){
        
        calendarPhys1.remove(a);
        
    }
}
