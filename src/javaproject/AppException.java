/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author Doriane Lami
 */
public class AppException extends Exception {

    /**
     * Creates a new instance of <code>AppCalendarException</code> without
     * detail message.
     */
    public AppException() {
    }

    /**
     * Constructs an instance of <code>AppCalendarException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AppException(String msg) {
        super(msg);
    }
}
