package com.tadpoles.car_sales;

public class Employee {
    private String name;
    private int emp_id;

    public Employee(String name, int emp_id) {
        this.name = name;
        this.emp_id = emp_id;
    }

    public String getName() { return name; }
    public int getEmpId() { return emp_id; }
}
