package com.example.EmployeePayroll_App.model;

//Ensure correct JPA annotations
import jakarta.persistence.*;
import lombok.*;

//Mark this class as a JPA entity
@Entity
//Match the table name in MySQL
@Table(name = "employee_table")
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    //UC_01 (Section -2)Handling Employee Payroll DTO and Model
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

//    //UC_02
//    //Every entity must have an ID
//    @Id
//    //Auto-increment primary key
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    //Ensure this column exists
//    @Column(name = "name", nullable = false)
//    private String name;
//
//    @Column(name = "salary", nullable = false)
//    private double salary;

}
