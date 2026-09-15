package com.tadpoles.car_sales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {
    private final List<Car> available_cars = new ArrayList<>();
    private final List<Sale> sales = new ArrayList<>();

    public void addCar(Car car) {
        available_cars.add(car);
    }

    public void sell_car(Car car, int emp_id) {
        Employee employee = new Employee("Employee " + emp_id, emp_id);
        sell_car(car, employee);
    }

    public void sell_car(Car car, Employee employee) {
        if (!available_cars.remove(car)) {
            throw new IllegalArgumentException("Car is not available for sale");
        }
        sales.add(new Sale(car, employee, car.getPrice()));
    }

    public float get_profits() {
        float total = 0.0f;
        for (Sale sale : sales) {
            total += sale.getProfit();
        }
        return total;
    }

    public List<Car> get_available_cars() {
        return Collections.unmodifiableList(available_cars);
    }

    public List<Sale> getSales() {
        return Collections.unmodifiableList(sales);
    }
}
