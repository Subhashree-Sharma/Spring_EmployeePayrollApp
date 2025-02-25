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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    //UC_02

    //Every entity must have an ID
    @Id
    // Auto-increment primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Ensure this column exists
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "salary", nullable = false)
    private double salary;
}
