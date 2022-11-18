package Concrete_Abstract_Interface_Demo;

public abstract class Vehicle {
    // abstract class allows for some implementation
    // here any subclass must implement move() method, but halt is already implemented below

    int nW;  // number of wheels

    public Vehicle() {  // contrcutor 1 - can only be called with super()
        this.nW = 4;
    }

    public Vehicle(int w) {  // constructor 2 - can only be called with super()
        this.nW = w;
    }

    public abstract void move();

    public void halt() {
        System.out.println("Stopping");
    }
}
