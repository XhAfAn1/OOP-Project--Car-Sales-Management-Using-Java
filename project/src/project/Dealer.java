package project;

import java.util.*;

public class Dealer extends User {

    private int DeID;
    ArrayList<Car> carList = new ArrayList<>();
    private int numberOfCars = this.carList.size();

    Dealer() {

    }

    Dealer(int DeID, String name, String address, String email, String phone) {
        super(name, address, email, phone);
        this.DeID = DeID;
    }

    public int getDeID() {
        return DeID;
    }

    public void setDeID(int DeID) {
        this.DeID = DeID;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    void addCar(Car car) {
        carList.add(car);
        numberOfCars++;
    }

    void removeCar(Car car) {
        carList.remove(car);
        numberOfCars--;
    }

    void printAllCars() {
        System.out.println("All cars by this dealer are :");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Dealer details: \n" + "Dealer Id: " + getDeID() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nE-mail: " + getEmail() + "\nPhone No.: " + getPhone() + "\nNumber of Cars: " + carList.size();
    }
    public String toString1() {
        return "Dealer details: \n" + "Dealer Id: " + getDeID() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nE-mail: " + getEmail() + "\nPhone No.: " + getPhone() + "\nNumber of Cars: " + carList.size()+ "\nCar List: " + carList;
    }

}
