package com.example.salary;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    public SalaryResponse calculateSalary(SalaryRequest request) {
        double basic = request.getBasicSalary();
        double allowances = basic * 0.20;
        double deductions = basic * 0.10;
        double netSalary = basic + allowances - deductions;

        SalaryResponse response = new SalaryResponse();
        response.setName(request.getName());
        response.setBasicSalary(basic);
        response.setAllowances(allowances);
        response.setDeductions(deductions);
        response.setNetSalary(netSalary);
        return response;
    }
}
