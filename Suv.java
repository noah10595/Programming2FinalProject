package rentalkiosk;
/**
 * Final Project - Subclass of Vehicle class
 * 
 * @author krystinarush
 */

public class Suv extends Vehicle {
	private int dailyFee;
        private int numSeats;

                //Constructor
		public Suv(String make, String model, int year, String vinNumber, 
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
                    return "This SUV is a " + this.year + " " + this.make + " " + this.model + " " +
                            ". There are " + this.numSeats + " seats and the daily rental fee is $" + this.dailyFee + ".00.";
                }
	}

        