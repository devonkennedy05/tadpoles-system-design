package com.tadpoles.car_sales;

public class Sale {
    private final Car car;
    private final Employee employee;
    private final float sale_price;

    public Sale(Car car, Employee employee, float sale_price) {
        this.car = car;
        this.employee = employee;
        this.sale_price = sale_price;
    }

    public Car getCar() { return car; }
    public Employee getEmployee() { return employee; }
    public float getSalePrice() { return sale_price; }
    public float getProfit() { return sale_price - car.getMsrp(); }
}
