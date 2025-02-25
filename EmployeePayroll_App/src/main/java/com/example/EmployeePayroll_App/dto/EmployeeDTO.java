package com.example.EmployeePayroll_App.dto;

public class EmployeeDTO {

    //UC_01 & Uc_02(Section -2)Handling Employee Payroll DTO and Model
    private String name;
    private double salary;

    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}