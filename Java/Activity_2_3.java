interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
//Base class 
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;
    //the Bicycle class with constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    //Bicycle class with three methods
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }
    // print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}
//Derived class
class RoadBike extends Bicycle {
    //The RoadBike subclass adds one more field
    public int seatHeight;
    //The RoadBike subclass with one constructor
    public RoadBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }
    // the RoadBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}
//Driver class 
public class Activity_2_3 {
    public static void main(String args[]) {
    	RoadBike rb = new RoadBike(3, 0, 25);
        System.out.println(rb.bicycleDesc());
        rb.speedUp(20);
        rb.applyBrake(5);
    }
}

/*
 * In this activity we will be implementing Hybrid Inheritance (Multiple and
 * Simple) Start by creating two interfaces - BicycleParts and BicycleOperations
 * In BicycleParts: public int gears: number of gears on the bicycle public int
 * speed: max speed of bicycle In BicycleOperations: public applyBrake(int
 * decrement): how much to slow down the bicycle by. public speedUp(int
 * increment): how much to speed up the bicycle by.
 */
/*
 * Next create the base class Bicycle. It implements both interfaces
 * BicycleParts, BicycleOperations. Initialize the values of gears and
 * currentSpeed in a constructor. Write the definition of the applyBrake() and
 * speedUp(). applyBrake() reduces the currentSpeed by the number passed to the
 * method. speedUp() increases the currentSpeed by the number passed to the
 * method. Add another method to the base class - bicycleDesc(). It prints the
 * number of gears and the currentSpeed of the bicycle.
 */