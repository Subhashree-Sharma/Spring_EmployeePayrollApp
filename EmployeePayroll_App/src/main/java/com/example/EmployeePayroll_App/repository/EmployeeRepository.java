package com.example.EmployeePayroll_App.repository;
import com.example.EmployeePayroll_App.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//UC_02
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
