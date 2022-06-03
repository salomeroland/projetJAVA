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
public class AppDentTest {
    
    public AppDentTest() {
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        AppDent instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
