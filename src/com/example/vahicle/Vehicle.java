package com.example.vahicle;

public class Vehicle {
    private String type;
    private String brand;
    private String model;
    private int year;
    private long mileage;
    private String VINnumber;

    public Vehicle(String type, String brand, String model, int year, long mileage, String VINnumber) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.VINnumber = VINnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public String getVINnumber() {
        return VINnumber;
    }

    public void setVINnumber(String VINnumber) {
        this.VINnumber = VINnumber;
    }

    @Override
    public String toString() {
        return "type: " + type + ", brand: " + brand + ", model: " + model + ", year: " + year + ", mileage: " + mileage + ", VINnumber: " + VINnumber + "";
    }
}
