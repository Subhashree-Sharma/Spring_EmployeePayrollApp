package com.example.EmployeePayroll_App.controller;
import com.example.EmployeePayroll_App.dto.EmployeeDTO;
import com.example.EmployeePayroll_App.model.Employee;
import com.example.EmployeePayroll_App.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    //UC_01 & UC_03 (Section -4)
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Create Employee - Validates Name Field
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee createdEmployee = employeeService.createEmployee(employeeDTO);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    // Update Employee - Validates Name Field
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id, @Valid @RequestBody EmployeeDTO employeeDTO) {
        Employee updatedEmployee = employeeService.updateEmployee(id, employeeDTO);
        return ResponseEntity.ok(updatedEmployee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

//    //UC_01 & Uc_02 & Uc_03(Section -2)Handling Employee Payroll DTO and Model
//    //UC_01 & Uc_04 (Section -3)
//    @Autowired
//    private EmployeeService employeeService;
//
//    @PostMapping("/add")
//    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
//        return employeeService.addEmployee(new Employee(employeeDTO.getName(), employeeDTO.getSalary()));
//    }
//
//    @GetMapping("/all")
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }

    //UC_02
//    private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping
//    public List<Employee> getAllEmployees() {
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping("/{id}")
//    public Employee getEmployeeById(@PathVariable int id) {
//        return employeeService.getEmployeeById(id);
//    }
//
//    @PostMapping
//    public Employee addEmployee(@RequestBody Employee employee) {
//        return employeeService.addEmployee(employee);
//    }
//
//    @PutMapping("/{id}")
//    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
//        return employeeService.updateEmployee(id, employee);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//    }
}
