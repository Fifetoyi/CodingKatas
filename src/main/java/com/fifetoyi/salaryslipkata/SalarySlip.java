package com.fifetoyi.salaryslipkata;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public BigDecimal monthlySalary() throws Exception {
        // throw an exception when the value of monthly salary is negative
        if (employee.getSalary().doubleValue() < 0.0) {
            throw new Exception("Monthly salary cannot be negative");
        }
        return employee.getSalary().divide(BigDecimal.valueOf(12.0), 2, RoundingMode.HALF_UP);
    }
}
