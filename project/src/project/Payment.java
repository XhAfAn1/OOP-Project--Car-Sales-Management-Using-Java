
package project;
import java.util.*;

public class Payment {
    private static int paymentID=0;
    private String paymentType;
    private double amount;
    private String paymentDetails;
    private Date paymentDate;
    private Customer customerinfo;
    
    Payment(){
        paymentID=++paymentID;
        paymentType="Cash";
        paymentDetails=" Payment Successful ";
        paymentDate=new Date();
    }
    Payment(double amount,Customer cus){
        this.amount=amount;
         this.paymentID=++paymentID;
        paymentType="Cash";
        customerinfo=cus;
        paymentDetails=" Payment Successful.paid by Customer ID: "+customerinfo.getCusID();
        paymentDate=new Date();
        
    }
    Payment(String paymentType,double amount,String paymentDetails){
        this.paymentID=++paymentID;
        this.paymentType=paymentType;
        this.amount=amount;
        this.paymentDetails=paymentDetails;
        paymentDate=new Date();
    }

    public static int getPaymentID() {
        return paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Customer getCustomerinfo() {
        return customerinfo;
    }

    public void setCustomerinfo(Customer customerinfo) {
        this.customerinfo = customerinfo;
    }
    
    @Override
    public String toString() {
        return "Payment: \n" + "Payment Id: " + getPaymentID() + "\nPayment Type: " + getPaymentType() + "\nAmount: " + getAmount() + "\nPayment Details: " + getPaymentDetails() + "\nPayment Date: " + getPaymentDate();
    }

    
    
    
}
