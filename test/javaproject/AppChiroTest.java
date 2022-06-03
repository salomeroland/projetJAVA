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
public class AppChiroTest {
    
    public AppChiroTest() {
    }

    @Test
    public void testToString() throws AppException {
        System.out.println("toString");
        AppChiro instance = new AppChiro("Salomé", "Sam", 23, 05, 2022, 10, 45);
        String expResult = "patient: Salomé, doctor: Sam, on: 23/5/2022 at: 10:45, duration : 45 min";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
