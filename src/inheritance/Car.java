package inheritance;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.numberOfWheels();
        obj.start();
    }
}
