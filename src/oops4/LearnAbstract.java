package oops4;

public class LearnAbstract {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.accelerate();
        car1.brakes(4);
        car1.honks();
    }    
}
abstract class Vehicle {
    abstract void accelerate();
    abstract int brakes(int wheels);
    void honks() {
        System.out.println("Vehicle is honking");
    }
}

class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    int brakes(int wheels) {
        System.out.println("Car is braking");
        return wheels;
    }
}