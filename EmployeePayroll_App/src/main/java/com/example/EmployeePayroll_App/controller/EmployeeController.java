package com.example.EmployeePayroll_App.controller;
import com.example.EmployeePayroll_App.model.Employee;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    //UC_01
    @GetMapping
    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Subhashree Sharma", 50000),
                new Employee(2, "Sonali Sharma", 60000)
        );
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        //In future, this will be stored in DB
        return employee;
    }
}
