package com.hingebridge.devops.model;

import lombok.Data;

@Data
public class Employee {
    private String firstname;
    private String lastname;
    private Department dept;

    public enum  Department{
        ACCOUNTS,
        DEVOPS,
        SALES,
        HEALTH
    }
}
