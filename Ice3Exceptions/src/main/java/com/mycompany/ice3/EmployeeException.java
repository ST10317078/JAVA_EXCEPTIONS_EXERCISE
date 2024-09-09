/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice3;

/**
 *
 * @author mpho
 */
public class EmployeeException extends Exception{
    private String alert;
    
   public EmployeeException(String alert) {
        super(alert);
        this.alert = alert;
    }
       
     @Override
    public String toString() {
        return "EmployeeException: " + alert;
    }
}
