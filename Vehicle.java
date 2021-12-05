package rentalkiosk;

public abstract class Vehicle {

		protected String make;
		protected String model;
		protected int year;
		protected String vinNumber;

		//No-arg constructor
		public Vehicle() {	
		}
		
		//Constructor
		public Vehicle(String make, String model, int year, String vinNumber) {
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
		public void setYear(int year) {
			this.year = year;
		}
		//get year
		public int getYear() {
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
		
}
