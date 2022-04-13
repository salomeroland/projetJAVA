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
public class Calendar extends TreeSet<Appointment> {     //abstract ?

//    public void verification(Appointment check) throws AppException {
//        if (!isCompatible(check, this)) {
//            throw new AppException("Two appointments can't take place at the same time");
//        }
//    }
    public String toString() {
        String ret = "";
        System.out.println("Calendar : ");
        for (Appointment app : this) {
            System.out.println(app);
        }
        return ret;
    }

    public void addApp(Appointment a) throws AppException {
        if (a.isCompatible(this)) {
            this.add(a);
        }
    }

    public void delApp(Appointment a) throws AppException {

    }

    public void modApp(Appointment a) throws AppException {

    }

}
