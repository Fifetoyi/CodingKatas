package com.fifetoyi.salaryslipkata;

public class SalarySlipGenerator {

    public SalarySlip generateFor(Employee employee) {
        return new SalarySlip(employee);
    }
}

