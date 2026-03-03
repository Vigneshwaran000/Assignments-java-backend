package com.day6.pack;

class Employee {

    int empId;
    double basicSalary;

    void calculateSalary(double bonusPercentage) {

        double bonusAmount = basicSalary * bonusPercentage / 100;

        double totalSalary = basicSalary + bonusAmount;

        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Amount: " + bonusAmount);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class task3 {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.empId = 101;
        e1.basicSalary = 150000;

        e1.calculateSalary(10);  // 10% Bonus
    }
}