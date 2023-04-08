package com.fifetoyi.salaryslipkata;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalarySlip {

    private final Employee employee;
    private final BigDecimal NATIONAL_INSURANCE_CONTRIBUTION = BigDecimal.valueOf(0.12);
    private final BigDecimal MONTHS_IN_A_YEAR = BigDecimal.valueOf(12.0);

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

    public BigDecimal nationalInsurance() {
        BigDecimal salaryRemainder = employee.getSalary().subtract(BigDecimal.valueOf(8060));
        if(employee.getSalary().doubleValue() <= 8060.0) {
            return BigDecimal.ZERO;
        }
        var annualContribution = salaryRemainder.multiply(NATIONAL_INSURANCE_CONTRIBUTION);
        var monthlyContribution = annualContribution.divide(MONTHS_IN_A_YEAR, 2, RoundingMode.HALF_UP);
        return monthlyContribution;
    }
}
