package collectionsAndLists;

import java.util.Vector;
import java.util.Iterator;
import java.util.List;

public class LearnVector {
    public static void main(String[] args) {
        List<String> bikes = new Vector<>();

        bikes.add("Kawasaki ninja zx10r");
        bikes.add("Ducati V4 Panigale");
        bikes.add("Java Bobber");
        bikes.add("Royal Enfield continental gt 650");
        bikes.add("Royal Enfield Himalayan");

        Iterator<String> bike = bikes.iterator();
        while(bike.hasNext()) {
            System.out.println("Bike is : " + bike.next());
        }

        List<String> smallList = bikes.subList(1, 3);
        System.out.println("Small list is : " + smallList);
    }
}
