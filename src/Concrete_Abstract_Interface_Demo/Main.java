package Concrete_Abstract_Interface_Demo;

public class Main {
    //declarations
    public static Drone d1;
    public static Rover r1;
    public static Vehicle v1;
    public static Vehicle[] allVehicles = new Vehicle[10];

    // main method
    public static void main(String[] args) {
        d1 = new Drone();  // constructor call
        r1 = new Rover(6);// constructor call
//  v1 = new Vehicle();  // cant do this - abstract class constructor can only be called from subclass with super()
        initVehicles();  // calls constructors
        System.out.println(Flyable.maxAltitude);  // a field declared and assigned in the interface can be used
        moveVehicles();  // calls methods
//  allVehicles[0].takeOff();  no can do - must be instanced as a drone to work because the method is not in superclass but added in subclass

        d1.takeOff();
    }

    public static void initVehicles() {
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                allVehicles[i] = new Rover();  // first 5 are Rover class
                System.out.println("madeARover");
            } else {
                allVehicles[i] = new Drone();  // last 5 are drone class
                System.out.println("madeADrone");
            }
        }
    }

    public static void moveVehicles() {  // polymorphism
        for (int i = 0; i < 10; i++) {
            System.out.println("Vehcile # " + i);
            allVehicles[i].move();
            allVehicles[i].halt();
            //allVehicles[i].takeoff(); // no can do - method only in Drone class
        }
    }
}
