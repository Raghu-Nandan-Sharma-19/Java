package javaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//
//        list.add(4); // This will add 4 at the end of the list
//        System.out.println(list);
//
//        list.add(1, 50); // This will add 50 at first index
//        System.out.println(list);
//
//        List<Integer> newList = new ArrayList<>(); // Creating new array list
//        newList.add(150);
//        newList.add(160);
//
//        list.addAll(newList); // This will add all elements of new list to old list
//        System.out.println(list);
//
//        System.out.println(list.get(1)); // this will print element of given index

//          List<Integer> list = new ArrayList<>();
//          list.add(10);
//          list.add(20);
//          list.add(30);
//          list.add(40);
//          list.add(50);
//          list.add(60);
//          list.add(70);
//          list.add(80);
//
//          System.out.println(list);
//
//          list.remove(1); // This will remove the element at index 1
//          System.out.println(list);
//
//          list.remove(Integer.valueOf(40)); // This will remove the given value from list
//          System.out.println(list);
//
//          list.clear(); // This will remove all elements from the list
//          System.out.println(list);

          // Time complexity O(N)
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);

            System.out.println(list);

            list.set(2, 1000);   // changes the value of given index
            System.out.println(list);

            System.out.println(list.contains(50));  // checks if the element is present in the list

            for(int i=0; i<list.size(); i++) {
                System.out.println("The element is : "+list.get(i));
            }
            for(Integer element: list) {
                System.out.println("For each element is : "+ element);
            }

            Iterator<Integer> it = list.iterator();

            while(it.hasNext()) {
                System.out.println("Iterator : "+ it.next());
            }
    }
}
