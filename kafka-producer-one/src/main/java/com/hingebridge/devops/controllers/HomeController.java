package com.hingebridge.devops.controllers;

import com.hingebridge.devops.model.Employee;
import com.hingebridge.devops.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/producer-one")
public class HomeController {
    private final EmployeeService employeeService;

    @PostMapping("register")
    public void registerEmployee(@RequestBody Employee employee){
        employeeService.registerNew(employee);
    }
}
