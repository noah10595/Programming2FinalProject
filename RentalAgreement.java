package finalproject;
import java.util.Date;
/*
 * @author Jacob Smith
 */
public class RentalAgreement {
    protected double agreementId; // id used for unique agreements. More than one possible per customer
    protected String customerId; // id of the customer in the CustomerAccount class
    protected String vehicleId; // id of the car in the car class/file
    protected Date date; // date the rental begins
    protected int rentalLength; // days the car will be rented
    protected double rentalFee; // amount of money charged for the rental.
    protected String payment; // credit/debit account used to pay the rental
    protected boolean status; // contract open true/false
    
    // no arg constructor
    public RentalAgreement() {
        this.agreementId = 0.0;
        this.customerId = "";
        this.vehicleId = "";
        this.date = null;
        this.rentalLength = 0;
        this.rentalFee = 0.0;
        this.payment = "";
        this.status = false;
    }
    
    // full constructor
    public RentalAgreement(double a, String c, String v, Date d, int r, double f, String p, boolean s) {
        this.agreementId = a;
        this.customerId = c;
        this.vehicleId = v;
        this.date = d;
        this.rentalLength = r;
        this.rentalFee = f;
        this.payment = p;
        this.status = s;
    }
    
    // mutator method for agreementId
    public void setAgreementId(double a) {
        this.agreementId = a;
    }
    
    // accessor method for agreementId
    public double getAgreementId() {
        return agreementId;
    }
    
    // mutator method for customerId
    public void setCustomerId(String c) {
        this.customerId = c;
    }
    
    // accessor method for customerId
    public String getCustomerId() {
        return customerId;
    }
    
    // mutator method for vehicleId
    public void setVehicleId(String v) {
        this.vehicleId = v;
    }
    
    // accessor method for vehicleId
    public String getVehicleId() {
        return vehicleId;
    }
    
    // mutator method for date
    public void setDate(Date d) {
        this.date = d;
    }
    
    // accessor method for date
    public Date getDate() {
        return date;
    }
    
    // mutator method for rentalLength
    public void setRentalLength(int r) {
        this.rentalLength = r;
    }
    
    // accessor method for rentalLength
    public int getRentalLength() {
        return rentalLength;
    }
    
    // mutator method for rentalFee
    public void setRentalFee(double f) {
        this.rentalFee = f;
    }
    
    // accessor method for rentalFee
    public double getRentalFee() {
        return rentalFee;
    }
    
    // mutator method for payment
    public void setPayment(String p) {
        this.payment = p;
    }
    
    // accessor method for payment
    public String getPayment() {
        return payment;
    }
    
    // mutator method for status
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    // accessor method for status
    public boolean getStatus() {
        return status;
    }
    
    public void print() {
        System.out.println("Details for " + agreementId + ":");
        System.out.println("Vehicle: " + vehicleId);
        System.out.println("Date: " + date);
        System.out.println("Length of Contract: " + rentalLength);
        System.out.println("Fee: " + rentalFee); 
        System.out.println("Payment: " + payment); 
        System.out.println("Open: " + status);
    }
}
