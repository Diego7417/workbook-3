package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("Employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine(); // Ignore header line
            String input;

            while ((input = bufReader.readLine()) != null){
                System.out.println(input);
                String[] employeeData = input.trim().split("\\|");
                System.out.println(employeeData[0]);
                System.out.println(employeeData[1]);
                System.out.println(employeeData[2]);
                System.out.println(employeeData[3]);


                
                int employeeId = Integer.parseInt(employeeData[0]);
                String employeeName = employeeData[1];
                double employeeHoursWorked = Double.parseDouble(employeeData[2]);
                double employeeGrossPay = Double.parseDouble(employeeData[3]);

                Employee Employee = new Employee(employeeId, employeeName, employeeHoursWorked, employeeGrossPay);
                System.out.printf("ID: %d | Name: %s | Hours Worked: %.2f |Gross Pay: $%.2f",
                Employee.getEmployeeId(),
                Employee.getName(),
                Employee.getHoursWorked(),
                Employee.getGrossPay());



            }
            bufReader.close();

            }
        catch (IOException e){
            e.printStackTrace();


        }

    }
}
