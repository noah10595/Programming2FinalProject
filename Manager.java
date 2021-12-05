package rentalkiosk;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Vehicle> inventory;
	private ArrayList<CustomerAccount> customers;
	
	//no-args constructor
	public Manager() {
		inventory = new ArrayList<Vehicle>();
		customers = new ArrayList<CustomerAccount>();
	}

	public void getInventory() {
		for(Vehicle car:inventory) {
			System.out.println(car.year + car.make + car.model);
		}
	}

	public void addVehicle(Vehicle v) {
		inventory.add(v);
	}

	public ArrayList<CustomerAccount> getCustomers() {
		for(customer:customers) {
			return(System.out.println(customer.name));
		}
	}

	public void addCustomer(CustomerAccount c) {
		customers.add(c);
	}
	
	public void removeVehicle(Vehicle v) {
		for(int i = 0; i > inventory.length; i++) {
			if(inventory(i).vinNumber == v.vinNumber) {
				inventory.remove(i);
			}
		}
	}
	
	public void removeCustomer(CustomerAccount c) {
		for(int i = 0; i > customers.length; i++) {
			if(customers(i).customerId == c.customerId) {
				customers.remove(i);
			}
		}
	}
	
	
	
	
	
	
}
