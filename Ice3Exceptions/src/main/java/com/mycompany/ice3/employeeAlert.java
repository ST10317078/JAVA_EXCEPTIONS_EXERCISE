/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice3;

/**
 *
 * @author mpho
 */
public class employeeAlert {
        private static final String[] alert = {
        "Employee number must be numeric.",
        "Employee number must be between 1000 and 9999.",
        "Hourly pay rate must be numeric.",
        "Hourly pay rate must be at least R9.00.",
        "Hourly pay rate cannot be more than R25.00.",
        "Valid Employee data."
    };
        
        public static String getMessage(int index) {
        if (index >= 0 && index < alert.length) {
            return alert[index];
        } else {
            return "Unknown error.";
        }
    }
}