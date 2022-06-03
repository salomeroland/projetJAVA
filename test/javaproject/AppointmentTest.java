/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author salomeroland
 */
public class AppointmentTest {
    
    public AppointmentTest() {
    }
//public void testGetDebutHour() throws AppException {
//        System.out.println("getDebutHour");
//        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
//        int expResult = 10;
//        int result = instance.getDebutHour();
//        assertEquals(expResult, result);
//    }
    @Test
    public void testToString() throws AppException {
        System.out.println("toString");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        String expResult = "patient: Salomé, doctor: Sam, on: 23/5/2022 at: 10:45";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
//
//    @Test
//    public void testNewAppointment() throws Exception {
//        System.out.println("newAppointment");
//        String expResult = "Salomé", "Sam", 23, 05, 2022, 10, 45, 20;
//        Appointment result = Appointment.newAppointment();
//        assertEquals(expResult, result);
//       
//    }
//
    @Test
    public void testCompareTo() throws AppException {
        System.out.println("compareTo");
        Appointment o = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 46, 20);
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    @Test
    public void testFinalHour() throws AppException {
        System.out.println("finalHour");
        Appointment a = new Appointment("Salomé", "Sam", 23, 05, 2022, 11, 30, 20);
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 30, 20);
        int expResult = 11;
        int result = instance.finalHour(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testFinalMin() throws AppException {
        System.out.println("finalMin");
        Appointment a = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 05;
        int result = instance.finalMin(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testFinalTime() throws AppException {
        System.out.println("finalTime");
        Appointment a = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 30, 20);
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        String expResult = "10:50";
        String result = instance.finalTime(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDebutHour() throws AppException {
        System.out.println("getDebutHour");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 10;
        int result = instance.getDebutHour();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetDebutMin() throws AppException {
        System.out.println("getDebutMin");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 45;
        int result = instance.getDebutMin();
        assertEquals(expResult, result);
    }
    
     @Test
    public void testGetPaName() throws AppException {
        System.out.println("getPaName");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        String expResult = "Salomé";
        String result = instance.getPaName();
        assertEquals(expResult, result);
    }
    
      @Test
    public void testGetDocName() throws AppException {
        System.out.println("getDocName");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        String expResult = "Sam";
        String result = instance.getDocName();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetYear() throws AppException {
        System.out.println("getYear");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 2022;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }
    @Test
    public void testGetMonth() throws AppException {
        System.out.println("getMonth");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 05;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }
    @Test
     public void testGetDay() throws AppException {
        System.out.println("getDay");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 23;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }
    @Test
     public void testGetDuration() throws AppException {
        System.out.println("getDuration");
        Appointment instance = new Appointment("Salomé", "Sam", 23, 05, 2022, 10, 45, 20);
        int expResult = 20;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }
}


