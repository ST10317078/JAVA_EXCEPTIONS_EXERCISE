/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice3;

/**
 *
 * @author mpho
 */

import java.util.Scanner;


public class EmployeeForm {
    
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter employee number (1000-9999): ");
            String employeeNumberInput = scanner.nextLine();
            int employeeNumber = validateEmployeeNumber(employeeNumberInput);

            System.out.print("Enter hourly pay rate (R9.00 - R25.00): ");
            String hourlyPayRateInput = scanner.nextLine();
            double hourlyPayRate = validateHourlyPayRate(hourlyPayRateInput);

            System.out.println(employeeAlert.getMessage(5));

        } catch (EmployeeException e) {
            // Display the error message
            System.out.println(e);
        }

        scanner.close();
    }

   public static int validateEmployeeNumber(String input) throws EmployeeException {
        try {
            int number = Integer.parseInt(input);

            if (number < 1000 || number > 9999) {
                throw new EmployeeException(employeeAlert.getMessage(1));
            }
            return number;
        } catch (NumberFormatException e) {
            throw new EmployeeException(employeeAlert.getMessage(0));
        }
    }

    public static double validateHourlyPayRate(String input) throws EmployeeException {
        try {
            double rate = Double.parseDouble(input);

            if (rate < 9.00) {
                throw new EmployeeException(employeeAlert.getMessage(3));
            } else if (rate > 25.00) {
                throw new EmployeeException(employeeAlert.getMessage(4));
            }
            return rate;
        } catch (NumberFormatException e) {
            throw new EmployeeException(employeeAlert.getMessage(2));
        }
    }
}

