package project;

public class Car {

    private int carID;
    private String brand;
    private String model;
    private String color;
    private String carType;
    private String fuelType;
    private int year;
    private double price;
    private boolean available;

    Dealer dealerInfo;
    Customer customerInfo;

    Car() {

    }

    Car(int carID, String brand, String model, String color, String carType, String fuelType, int year, double price) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.fuelType = fuelType;
        this.year = year;
        this.price = price;
        this.available = true;
    }

    Car(int carID, String brand, String model, String color, String carType, String fuelType, int year, double price, Dealer dealer) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.fuelType = fuelType;
        this.year = year;
        this.price = price;
        this.available = true;
        this.dealerInfo = dealer;
        dealer.carList.add(new Car(carID, brand, model, color, carType, fuelType, year, price));
    }

    // getter setters
    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Dealer getDealerInfo() {
        return dealerInfo;
    }

    public void setDealerInfo(Dealer dealerInfo) {
        this.dealerInfo = dealerInfo;
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }

    public String toString1() {       
        return "Car details: \n" + "Car Id: " + getCarID() + "\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nColor: " + getColor() + "\nCar Type: " + getCarType() + "\nFuel Type: " + getFuelType() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nAvailable: " + isAvailable() + "\nDealer Info: " + getDealerInfo();
    }
    public String toString() {       
        return "Car details: \n" + "Car Id: " + getCarID() + "\nBrand: " + getBrand() + "\nModel: " + getModel() + "\nColor: " + getColor() + "\nCar Type: " + getCarType() + "\nFuel Type: " + getFuelType() + "\nYear: " + getYear() + "\nPrice: " + getPrice() + "\nAvailable: " + isAvailable();
    }

}
