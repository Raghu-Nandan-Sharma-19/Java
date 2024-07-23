package collectionsAndLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println("Number at index 2 is : " + list.get(2));
        list.set(2, 4);
        System.out.println("After setting 4 at index 2 list is : " + list);
        list.add(2, 300);
        System.out.println("After adding 300 at index 2 list is : " + list);
        list.remove(2);
        System.out.println("After removing number at index 2 list is : " + list);

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Banana");
        Iterator<String> fruit = fruits.iterator();
        while (fruit.hasNext()) System.out.println("Iterator : " + fruit.next());
        List<String> smallList = fruits.subList(1, 3);
        System.out.println("Sublist from index 1 to index 3 is : " + smallList);
    }    
}
