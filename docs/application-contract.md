# Tadpoles Car Sales App Contract

## What this project does
This project is a simple car dealership program. It keeps track of cars, sales, and employees.

## Main classes

### Car
A car has these fields:
- `vin`
- `make`
- `model`
- `year`
- `color`
- `msrp`
- `price`

### Employee
An employee has:
- `name`
- `emp_id`

### Sale
A sale stores:
- the car that was sold
- the employee who sold it
- the sale price

Method:
- `getProfit()`: gets the profit from the sale

### Inventory
Inventory is where all the cars and sales are stored.

Methods:
- `addCar(Car car)`: adds a car to the inventory
- `sell_car(Car car, int emp_id)`: sells a car using an employee id
- `sell_car(Car car, Employee employee)`: sells a car using an employee object
- `get_profits()`: returns total profit
- `get_available_cars()`: returns the cars still available
- `getSales()`: returns all completed sales

## Main program
The main class is `com.tadpoles.car_sales.App`.

## What the demo does
1. Creates a few sample cars
2. Adds them to inventory
3. Sells one car
4. Prints the cars still available
5. Prints the sales that happened
6. Prints the total profit

## Notes
- `get_available_cars()` and `getSales()` do not let you change the lists directly.
- When a car is sold, it is removed from inventory.
- Profit is based on the sale price and the MSRP.
