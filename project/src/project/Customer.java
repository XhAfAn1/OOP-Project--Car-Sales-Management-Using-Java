package project;

import java.util.ArrayList;

public class Customer extends User {

    private int cusID;
    private boolean hasMadeOrder = false;
    private int numberOfOrder = 0;
    private Payment paymentdetails;
    private boolean paymentStatus = false;
    ArrayList<Car> carList = new ArrayList<>();

    Customer() {

    }

    Customer(int cusID, String name, String address, String email, String phone) {
        super(name, address, email, phone);
        this.cusID = cusID;
    }

    public int getCusID() {
        return cusID;
    }

    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    public boolean hasMadeOrder() {
        return hasMadeOrder;
    }

    public void setHasMadeOrder(boolean hasMadeOrder) {
        this.hasMadeOrder = hasMadeOrder;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public Payment getPaymentdetails() {
        return paymentdetails;
    }

    public void setPaymentdetails(Payment paymentdetails) {
        this.paymentdetails = paymentdetails;
        this.paymentStatus = true;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    void buyCar(Car car) {
        carList.add(car);
        numberOfOrder++;
    }

    void cancelOrder(Car car) {
        carList.remove(car);
        numberOfOrder--;
    }

    void cancelAllOrders() {
        carList = null;
    }

    void printAllOrderedCars() {
        System.out.println("All ordered cars are:");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i));
            System.out.println("");
        }
    }

    public String toString() {
        return "Customer Details: \n" + "Customer Id: " + getCusID() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nE-mail: " + getEmail() + "\nPhone No.: " + getPhone() + "\nHas Made Order: " + hasMadeOrder() + "\nNumber of Order: " + getNumberOfOrder();
    }
    public String toString1() {
        return "Customer Details: \n" + "Customer Id: " + getCusID() + "\nName: " + getName() + "\nAddress: " + getAddress() + "\nE-mail: " + getEmail() + "\nPhone No.: " + getPhone() + "\nHas Made Order: " + hasMadeOrder() + "\nNumber of Order: " + getNumberOfOrder() + "\nCar List: " + carList;
    }

}
