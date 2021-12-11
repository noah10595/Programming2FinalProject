package finalproject;
/* This class is a subclass of the Vehicle class.
 *
 * @author Jonah Reardon
 */
public final class Sedan extends Vehicle{
    
    private int numOfDoors;
    private int trunkSize;
    
    //No-arg or default constructor
    public Sedan() {
    }
    
    //Constructor
    public Sedan(String make, String model, String year, String vinNumber, int numOfDoors, int trunkSize) {
        super(make, model, year, vinNumber);//the super class and its instance variables
        this.numOfDoors = numOfDoors; //instance variable
        this.trunkSize = trunkSize; // instance variable
    }
    //Getter or accessor method for numOfDoors
    public int getNumOfDoors() {
        return this.numOfDoors;
    }
    //Setter or mutator method for numbOfDoors
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }
    //Getter or accessor method for trunkSize
    public int getTrunkSize() {
        return this.trunkSize;
    }
    //Setter or mutator method for trunkSize
    public void setTrunkSize(int trunkSize) {
        this.trunkSize = trunkSize;
    }
    // Returns string representation of the object to be used for output
    @Override
    public String toString() {
        return this.year + " " + this.make + " " + this.model;
    }
}