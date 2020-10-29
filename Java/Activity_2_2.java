import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public List<String> getPassengers() {
        return passengers;
    }
}
public class Activity_2_2 {
    public static void main(String[] args) throws InterruptedException {
        //plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers
        plane.onboard("John");
        plane.onboard("Mac");
        plane.onboard("Rose");
        System.out.println("Plane took off time: " + plane.takeOff());
        System.out.println("People on the plane: " + plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}

/*
 * Create another class named EncapsulationActivity. In this class we will have
 * our main method. First create an object of the Plane class named plane. Set
 * the maxPassengers value to 10 by passing it to the constructor. Add names to
 * the passengers list using the on board method. Print the take-off time using
 * the takeOff() method. Print the list of passengers using the getPassengers()
 * method. Add a Thread.sleep() method to pause execution for 5 seconds. This is
 * to emulate plane in flight. Land() the plane and print the time of landing
 * using getLastTimeLanded() method.
 */