package finalproject;
/**
 * Final Project - Subclass of Vehicle class
 * 
 * @author krystinarush
 */

public class Suv extends Vehicle {
	private int dailyFee;
    private int numSeats;

                //Constructor
		public Suv(String make, String model, String year, String vinNumber, 
                        int numSeats, int dailyFee) {
			super(make, model, year, vinNumber);
                        this.numSeats = numSeats;
			this.dailyFee = dailyFee;
		}

		public int getDailyFee() {
			return this.dailyFee;
		}
                public void setDailyFee(int dailyFee) {
                        this.dailyFee = dailyFee;
		}
                public int getNumSeats() {
			return this.numSeats;
		}
                public void setNumSeats(int numSeats) {
                        this.numSeats = numSeats;
		}
                
                // Output
                @Override
                public String toString() {
                    return  this.year + " " + this.make + " " + this.model;
                            
                }
	}