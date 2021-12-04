package rentalkiosk;
import java.util.Date;
/*
 * @author Jacob Smith
 */
public class RentalAgreement {
    protected String agreementId; // id used for unique aggreements. More than one possible per customer
    protected String customerId; // id of the customer in the CustomerAccount class
    protected String vehicleId; // id of the car in the car class/file
    protected Date date; // date the rental begins
    protected int rentalLength; // days the car will be rented
    protected double rentalFee; // amount of money charged for the rental.
    protected String payment; // credit/debit account used to pay the rental
    
    // no arg constructor
    public RentalAgreement() {
        this.agreementId = "";
        this.customerId = "";
        this.vehicleId = "";
        this.date = null;
        this.rentalLength = 0;
        this.rentalFee = 0.0;
        this.payment = "";
    }
    
    // full constructor
    public RentalAgreement(String a, String c, String v, Date d, int r, double f, String p) {
        this.agreementId = a;
        this.customerId = c;
        this.vehicleId = v;
        this.date = d;
        this.rentalLength = r;
        this.rentalFee = f;
        this.payment = p;
    }
    
    // mutator method for agreementId
    public void setAgreementId(String a) {
        this.agreementId = a;
    }
    
    // accessor method for agreementId
    public String getAgreementId() {
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
}
