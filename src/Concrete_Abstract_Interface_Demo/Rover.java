package Concrete_Abstract_Interface_Demo;

public class Rover extends Vehicle {// a subclass of abstract class Vehicle - it must implement move()
    public Rover() {
        super();
    }

    public Rover(int w) {
        super(w);
    }

    public void climbObstacle() {
        System.out.println("Climbing");
    }

    public void move() {  // this is not overriding because move() is not implemented in abstract superclass Vehicle
        System.out.println("Rolling");
    }
}
