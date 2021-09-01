package com.mosh;

public class Employee {
    public static int numOfEmployees;

    public Employee() {
        numOfEmployees++;
    }

    public static void setNumOfEmployees(int numOfEmployees) {
        Employee.numOfEmployees = numOfEmployees;
    }
}
