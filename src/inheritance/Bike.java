package inheritance;

public class Bike extends TwoWheeler {
    String color;
    void start() {
        super.start();
        System.out.println(this);
        System.out.println(this.model + " bike is starting");
    }
    Bike() {
        super(3);
        System.out.println("Bike is being created");
    }
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.wheelsCount = 2;
        obj.model = "Ducati Panigale V4";
        obj.color = "Red";
        obj.start();
    }
}
