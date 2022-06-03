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
public class CalendarDentistTest {
    
    public CalendarDentistTest() {
    }

    @Test
    public void testToString() throws AppException {
        System.out.println("toString");
        CalendarDentist instance = new CalendarDentist();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddApp() throws Exception {
        System.out.println("addApp");
        AppDent a = null;
        CalendarDentist instance = new CalendarDentist();
        instance.addApp(a);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelApp() throws Exception {
        System.out.println("delApp");
        AppDent a = null;
        CalendarDentist instance = new CalendarDentist();
        instance.delApp(a);
        fail("The test case is a prototype.");
    }

    @Test
    public void testModApp() throws Exception {
        System.out.println("modApp");
        AppDent a = null;
        CalendarDentist instance = new CalendarDentist();
        instance.modApp(a);
        fail("The test case is a prototype.");
    }
    
}
