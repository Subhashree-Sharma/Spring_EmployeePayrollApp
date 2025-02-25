package com.example.EmployeePayroll_App.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//UC_01
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private double salary;
}
