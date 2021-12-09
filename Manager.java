package finalproject;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Vehicle> inventory;
	private ArrayList<CustomerAccount> customers;
	
	//no-args constructor
	public Manager() {
		inventory = new ArrayList<Vehicle>();
		customers = new ArrayList<CustomerAccount>();
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
	
	
	public boolean findSameCustomerID(String ID) {
		for(CustomerAccount customer:customers) {
			if(customer.getCustomerId().equals(ID)) {
				return true;
			}
		}return false;
	}
	
	public boolean loginSuccess(String ID, String password) {
		for(CustomerAccount customer: customers) {
			if(customer.getCustomerId().equals(ID) && customer.getCustomerPass().equals(password)) {
				return true;
			}
		}return false;
	}


	public void addVehicle(Vehicle v) {
		inventory.add(v);
	}


	public void addCustomer(CustomerAccount c) {
		customers.add(c);
	}
	
	public void removeVehicle(Vehicle v) {
		if(inventory.contains(v)) {
				inventory.remove(v);
		}
	}
	
	public void removeCustomer(CustomerAccount c) {
		if(customers.contains(c)) {
			customers.remove(c);
		}
	}
	
	
	
	
	
	
}
