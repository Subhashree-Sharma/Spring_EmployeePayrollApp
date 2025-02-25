package com.example.EmployeePayroll_App.service;
import com.example.EmployeePayroll_App.model.Employee;
import com.example.EmployeePayroll_App.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    //UC_01 & Uc_02 (Section -2) Handling Employee Payroll DTO and Model
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //UC_02
//    private final EmployeeRepository employeeRepository;
//
//    public EmployeeService(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    public Employee addEmployee(Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    public Employee getEmployeeById(int id) {
//        return employeeRepository.findById(id).orElse(null);
//    }
//
//    public Employee updateEmployee(int id, Employee employee) {
//        if (employeeRepository.existsById(id)) {
//            employee.setId(id);
//            return employeeRepository.save(employee);
//        }
//        return null;
//    }
//
//    public void deleteEmployee(int id) {
//        employeeRepository.deleteById(id);
//    }

}
