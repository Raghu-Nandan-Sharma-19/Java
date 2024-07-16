package inheritance;

public class Vehicle {
    int wheelsCount;
    void numberOfWheels() {
        System.out.println("There are " + wheelsCount + " wheels in car");
    }
    void start() {
        System.out.println("Vehicle is starting");
    }
}
