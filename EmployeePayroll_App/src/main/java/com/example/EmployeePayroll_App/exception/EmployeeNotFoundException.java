package com.example.EmployeePayroll_App.exception;

//Uc_03 (Section -4)
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
