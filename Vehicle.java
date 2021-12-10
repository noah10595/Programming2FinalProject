package finalproject;

/*
 * @author Noah Smith
 */
public abstract class Vehicle {

		protected String make;
		protected String model;
		protected String year;
		protected String vinNumber;

		//No-arg constructor
		public Vehicle() {	
		}
		
		//Constructor
		public Vehicle(String make, String model, String year, String vinNumber) {
			this.make = make;
			this.model = model;
			this.year = year;
			this.vinNumber = vinNumber;
			
		}
		//set make
		public void setMake(String make) {
			this.make = make;
		}
		// get make
		public String getMake() {
			return this.make;
		}
		//set model
		public void setModel(String model) {
			this.model = model;
		}
		//get model
		public String getModel() {
			return this.model;
		}
		//set year
		public void setYear(String year) {
			this.year = year;
		}
		//get year
		public String getYear() {
			return this.year;
		}
		//set price
		public void setVinNumber(String vinNumber) {
			this.vinNumber = vinNumber;
		}
		//get price
		public String getVinNumber() {
			return this.vinNumber;
		}
		
		public String toString() {
			return (year + " " + make + " " + model);
		}
		
}
