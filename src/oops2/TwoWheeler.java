package oops2;

public class TwoWheeler {
    int wheelsCount;
    String model;
    TwoWheeler() {
        System.out.println("Creating a two wheeler instance");
    }
    void start() {
        System.out.println("Two wheeler is starting");
    }
    TwoWheeler(int wheelsCount) {
        this.wheelsCount = wheelsCount;
        System.out.println("Creating a two wheeler with " + wheelsCount + " wheels");
    }
}
