package com.example.salary;

import lombok.Data;

@Data
public class SalaryResponse {
    private String name;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double netSalary;
}
