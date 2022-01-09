package com.hingebridge.devops.services;

import com.hingebridge.devops.model.Employee;

import java.util.function.Supplier;

public interface EmployeeService {
    void registerNew(Employee employee);
}
