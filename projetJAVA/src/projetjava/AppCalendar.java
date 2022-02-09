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
public class AppCalendar {
     protected TreeSet<App> calendar;

    public AppCalendar() {

        calendar = new TreeSet<App>();

    }

    public abstract void addApp(App a);
    
    
    public abstract void delApp(App a);
    
    
    public void modApp(App a){
        
        for(App o : calendar){
            if(o.equals(a)){
                Scanner sc;
                sc = new Scanner(System.in);
                System.out.println("What do you want to modifie ? (practitioner / patient / date / hour / duration)" );
                String rep = sc.next();
                if(rep.equals("practitioner")){
                    delApp(a);
                    System.out.println("Who is the practitioner ? (Phys1 / Phys2 / Dent / Chiro)");
                    String name = sc.next();
                    if(name.equals("Phys1")){
                        AppPhys newApp = AppPhys(a.getPaName(), "Phys1", a.getDay(), a.getMonth(), a.getYear(), a.getDebutHour(), a.getDebutMin());
                        
                    }
                    
                    
                    System.out.println("What do you want to modifie ? (patient / date / hour / duration)");
                    String mod = sc.next();
                    if(mod.equals("patient")){
                        System.out.println("What is the patient's name ?");
                        String paName = sc.next();
                        
                    }
                }
                
        }
        
    }
}
}

