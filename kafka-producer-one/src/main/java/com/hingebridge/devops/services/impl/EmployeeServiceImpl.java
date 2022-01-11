package com.hingebridge.devops.services.impl;

import com.hingebridge.devops.model.Employee;
import com.hingebridge.devops.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl  implements EmployeeService {
    private final KafkaTemplate<String, Employee> kafka;

    @Override
    public void registerNew(Employee employee) {
        System.out.println("--->> Sending to devops topic 'new_staff': " + employee);
        kafka.send("new_staff", employee);
    }
}