package com.fifetoyi.salaryslipkata;

import java.math.BigDecimal;

public class Employee {

    private final int id;
    private final String name;
    private final BigDecimal salary;

    public Employee(int id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
