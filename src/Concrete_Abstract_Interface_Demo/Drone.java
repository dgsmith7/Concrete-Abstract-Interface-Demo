package Concrete_Abstract_Interface_Demo;

public class Drone extends Vehicle implements Flyable {
    // must implement everything abstract in the super class and everything in the interface
    Drone() {
    }

    public void takeOff() {
        System.out.println("Taking off");
    }

    public void cruise() {
        System.out.println("In cruise flight");
    }

    public void land() {
        System.out.println("Landing");
    }

    public void hover() {
        System.out.println("Hovering");
    }

    public void move() {
        System.out.println("Flying");
    }}
