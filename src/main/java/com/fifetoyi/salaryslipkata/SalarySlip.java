package com.fifetoyi.salaryslipkata;

import java.math.BigDecimal;

public class SalarySlip {

    private Employee employee;

    public SalarySlip(Employee employee) {
        this.employee = employee;
    }

    private int employeeId() {
        return employee.getId();
    }

    private String employeeName() {
        return employee.getName();
    }

    private BigDecimal monthlySalary() {
        return employee.getSalary().divide(BigDecimal.valueOf(12));
    }
}
