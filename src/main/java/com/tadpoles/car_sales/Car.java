package com.tadpoles.car_sales;

public class Car {
    private String vin;
    private String make;
    private String model;
    private int year;
    private String color;
    private float msrp;
    private float price;

    public Car(String vin, String make, String model, int year, String color, float msrp, float price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.msrp = msrp;
        this.price = price;
    }

    public String getVin() { return vin; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getColor() { return color; }
    public float getMsrp() { return msrp; }
    public float getPrice() { return price; }
}
