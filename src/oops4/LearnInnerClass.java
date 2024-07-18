package oops4;

public class LearnInnerClass {
    
    class Toy {
        int price;
    }

    static class PlayStation {
        int price;
    }

    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45;
        System.out.println("Price of the toy is Rupees " + toy.price);

        PlayStation playStation = new PlayStation();
        playStation.price = 35000;
        System.out.println("Price of the play station is Rupees " + playStation.price);
    }
}
