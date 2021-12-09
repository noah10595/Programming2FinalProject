package finalproject;

/*
 * @author Jacob Smith
 */
public class CustomerAccount {
    // variables holding customer data
    private String customerId;
    private String customerPass;
    private String customerName;
    private String customerPhone;
    
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
    
    
}
