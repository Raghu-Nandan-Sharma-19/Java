package collectionsAndLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {
    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();

        cars.add("Rolls Royce Cullinan");
        cars.add("Bentley Bentayga");
        cars.add("Mercedes AMG G63");
        cars.add("Jeep wrangler Rubicon");

        Iterator<String> car = cars.iterator();
        while (car.hasNext()) System.out.println("Iterator : " + car.next());
        List<String> smallList = cars.subList(1, 3);
        System.out.println("Sublist from index 1 to index 3 is : " + smallList);

        // rest all methods are same as lists
    }
}
