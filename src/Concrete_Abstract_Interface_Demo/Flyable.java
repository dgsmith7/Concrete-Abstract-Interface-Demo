package Concrete_Abstract_Interface_Demo;

public interface Flyable {// an interface - no implementation - only definition.
    int maxAltitude = 500;

    // This says anything implementing this class must implement these three methods
    public void takeOff();
    public void cruise();
    public void land();

}
