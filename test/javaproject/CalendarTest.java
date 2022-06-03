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
public class CalendarTest {
    
    public CalendarTest() {
    }

    @Test
    public void testIsCompatible() {
        System.out.println("isCompatible");
        Appointment check = new Appointment ("Salomé", "Sam", 23, 05, 2022, 10, 45);
        Appointment app = new Appointment ("Salomé", "Sam", 24, 05, 2022, 15, 30);
        boolean expResult = false;
        boolean result = instance.isCompatible(check);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
/*
    @Test
    public void testVerification() throws Exception {
        System.out.println("verification");
        Appointment check = null;
        Calendar instance = new CalendarImpl();
        instance.verification(check);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Calendar instance = new CalendarImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddApp() throws Exception {
        System.out.println("addApp");
        Appointment a = null;
        Calendar instance = new CalendarImpl();
        instance.addApp(a);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelApp() throws Exception {
        System.out.println("delApp");
        Appointment a = null;
        Calendar instance = new CalendarImpl();
        instance.delApp(a);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModApp() throws Exception {
        System.out.println("modApp");
        Appointment a = null;
        Calendar instance = new CalendarImpl();
        instance.modApp(a);
        fail("The test case is a prototype.");
    }

    public class CalendarImpl extends Calendar {

        public void delApp(Appointment a) throws AppException {
        }

        public void modApp(Appointment a) throws AppException {
        }
    }
*/
    
}
