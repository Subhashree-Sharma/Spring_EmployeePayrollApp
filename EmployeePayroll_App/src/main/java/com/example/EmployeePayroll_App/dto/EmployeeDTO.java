package com.example.EmployeePayroll_App.dto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EmployeeDTO {

    //UC_01 (Section -4)
    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z]{2,}$", message = "Name should start with an uppercase letter and have at least 3 characters")
    private String name;

    private double salary;

//    //UC_01 & Uc_02 & Uc_03(Section -2)Handling Employee Payroll DTO and Model
//    //Uc_01 (Section -3)
//    private String name;
//    private double salary;
//
//    public EmployeeDTO(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
}