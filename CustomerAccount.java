package finalproject;

import java.util.ArrayList;
/*
 * @author Jacob Smith, Noah Smith
 */
public class CustomerAccount {
    // variables holding customer data
    private String customerId;
    private String customerPass;
    private String customerName;
    private String customerPhone;
    private ArrayList<RentalAgreement> agreements = new ArrayList<RentalAgreement>();
    // no arg constructor
    public CustomerAccount() {
        this.customerId = "";
        this.customerPass = "";
        this.customerName = "";
        this.customerPhone = "";
    }
    
    // constructor that fills in all data based on input
    public CustomerAccount(String id, String pass, String name, String phone) {
        this.customerId = id;
        this.customerPass = pass;
        this.customerName = name;
        this.customerPhone = phone;
    }
    
    // mutator method for accountId
    public void setCustomerId(String id) {
        this.customerId = id;
    }
    
    // accessor method for accountId
    public String getCustomerId() {
        return customerId;
    }
    
    // mutator method for customerName
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    
    // accessor method for customerName
    public String getCustomerName() {
        return customerName;
    }
    
    // mutator method for customerPhone
    public void setCustomerPhone(String phone) {
        this.customerPhone = phone;
    }
    
    // accessor method for customerPhone
    public String getCustomerPhone() {
        return customerPhone;
    }

	public String getCustomerPass() {
		return customerPass;
	}

	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}

	public ArrayList<RentalAgreement> getAgreements() {
		return agreements;
	}

	public void setAgreements(ArrayList<RentalAgreement> agreements) {
		this.agreements = agreements;
	}
	
	//adds agreement to list
	public void addAgreement(RentalAgreement agree) {
		agreements.add(agree);
	}
	
	//checks if agreement is active
	public boolean checkAgreementStatus(){
		for(RentalAgreement agreement: agreements) {
			if(agreement.getStatus()) {
				return true;	
			}
		} return false;
		
	}
	
	//gets vin number of current rented vehicle
	public String getRentalVin() {
		for(RentalAgreement agreement: agreements) {
			if(agreement.getStatus()) {
				String vin = agreement.getVehicleId();
				return vin;
			}
		}return "";
	}
	
	public void changeRentalStatus() {
		for(RentalAgreement agreement: agreements) {
			if(agreement.getStatus()) {
				agreement.setStatus(false);
			}
		}
	}
    
}
