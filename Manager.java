package finalproject;

import java.util.ArrayList;

/*
 * @author Noah Smith
 */
public class Manager {

	private ArrayList<Vehicle> inventory;
	private ArrayList<CustomerAccount> customers;
	private ArrayList<Vehicle> outOfInventory;
	
	//no-args constructor
	public Manager() {
		inventory = new ArrayList<Vehicle>();
		customers = new ArrayList<CustomerAccount>();
		outOfInventory = new ArrayList<Vehicle>();
		
	}


	public ArrayList<Vehicle> getInventory() {
		return inventory;
	}


	public void setInventory(ArrayList<Vehicle> inventory) {
		this.inventory = inventory;
	}


	public ArrayList<CustomerAccount> getCustomers() {
		return customers;
	}


	public void setCustomers(ArrayList<CustomerAccount> customers) {
		this.customers = customers;
	}
	
	
	public ArrayList<Vehicle> getOutOfInventory() {
		return outOfInventory;
	}


	public void setOutOfInventory(ArrayList<Vehicle> outOfInventory) {
		this.outOfInventory = outOfInventory;
	}
	
	//add Vehicle to inventory currently being rented
	public void addOutofInventory(Vehicle v) {
		outOfInventory.add(v);
	}
	
	//removes vehicle from inventory currently being rented
	public void removeOutOfInventory(Vehicle v) {
		if(outOfInventory.contains(v)) {
				outOfInventory.remove(v);
		}
	}
	
	//finds if there is a duplicate customer ID
	public boolean findSameCustomerID(String ID) {
		for(CustomerAccount customer:customers) {
			if(customer.getCustomerId().equals(ID)) {
				return true;
			}
		}return false;
	}
	
	//checks if login credentials are correct
	public boolean loginSuccess(String ID, String password) {
		for(CustomerAccount customer: customers) {
			if(customer.getCustomerId().equals(ID) && customer.getCustomerPass().equals(password)) {
				return true;
			}
		}return false;
	}
	
	//saves logged in customer information until they log out
	public CustomerAccount savedCustomer(String ID, String password) {
		for(CustomerAccount customer: customers) {
			if(customer.getCustomerId().equals(ID) && customer.getCustomerPass().equals(password)) {
				CustomerAccount loggedInCustomer = customer;
				return loggedInCustomer;
			}
		}	return null;	
	}

	//adds vehicle to inventory
	public void addVehicle(Vehicle v) {
		inventory.add(v);
	}
	
	//removes vehicle from inventory
	public void removeVehicle(Vehicle v) {
		if(inventory.contains(v)) {
				inventory.remove(v);
		}
	}
	
	//finds vehicle based on vin number
	public Vehicle findVehicle (String vin) {
		for(Vehicle car: inventory) {
			if(car.vinNumber.equals(vin)) {
				return car;
			}
		}return null;
	}
	
	//adds customer to customer list
	public void addCustomer(CustomerAccount c) {
		customers.add(c);
	}
	
	//removes customer from customer list
	public void removeCustomer(CustomerAccount c) {
		if(customers.contains(c)) {
			customers.remove(c);
		}
	}
	
}
