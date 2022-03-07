package com.aapeli.springpattern.microsoft;

import java.util.Arrays;

/**
 * @author jamesoladimeji
 * @created 31/01/2022 - 7:46 PM
 * @project IntelliJ IDEA
 */
public class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;

    public Employee(int employeeNumber, String firstName, String lastName) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee(2, "James", "Oaldimeji");
        employees[1] = new Employee(5, "Deji", "John");
        employees[2] = new Employee(1, "Ade", "Joseph");
        employees[3] = new Employee(3, "Kemi", "Adewumi");
        employees[4] = new Employee(4, "Yemi", "Iaybo");
        employees[5] = new Employee(6, "Kehinde", "Emmanuel");


        //doInsertionSort(employees);


        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeNumber() + " - "+ employee.getFirstName() + " - "+ employee.getLastName());
        }

    }

    static void doInsertionSort(Employee[] employees) {
        for(int i = 0; i < employees.length - 1; i++) {
            Employee current = employees[i];
            int j = i - 1;
            while (j >= 0 && employees[j].getEmployeeNumber() > current.getEmployeeNumber()) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = current;
        }
    }
}

