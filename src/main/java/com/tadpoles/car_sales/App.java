package com.tadpoles.car_sales;

public class App {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Car car1 = new Car("1HGBH41JXMN109186", "Toyota", "Camry", 2022, "White", 28000.00f, 29500.00f);
        Car car2 = new Car("2FTRX18W1XCA12345", "Honda", "Civic", 2023, "Blue", 26000.00f, 27900.00f);
        Car car3 = new Car("3VWFE21C04M000001", "Ford", "Mustang", 2021, "Red", 45000.00f, 46900.00f);

        inventory.addCar(car1);
        inventory.addCar(car2);
        inventory.addCar(car3);

        Employee employee = new Employee("Ava Johnson", 101);
        inventory.sell_car(car2, employee);

        System.out.println("=== Dealership Inventory Demo ===");
        System.out.println("Available cars:");
        for (Car car : inventory.get_available_cars()) {
            printCar(car);
        }

        System.out.println();
        System.out.println("Sales:");
        for (Sale sale : inventory.getSales()) {
            printSale(sale);
        }

        System.out.println();
        System.out.println("Total profit: $" + inventory.get_profits());
    }

    private static void printCar(Car car) {
        System.out.println(
            "- " + car.getYear() + " " + car.getMake() + " " + car.getModel()
                + " | VIN: " + car.getVin()
                + " | Color: " + car.getColor()
                + " | MSRP: $" + car.getMsrp()
                + " | Price: $" + car.getPrice()
        );
    }

    private static void printSale(Sale sale) {
        System.out.println(
            "- " + sale.getEmployee().getName() + " (ID " + sale.getEmployee().getEmpId() + ") sold "
                + sale.getCar().getYear() + " " + sale.getCar().getMake() + " " + sale.getCar().getModel()
                + " | Sale price: $" + sale.getSalePrice()
                + " | Profit: $" + sale.getProfit()
        );
    }
}
