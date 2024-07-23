package collectionsAndLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(10);
        list1.add(1);
        list1.add(20);
        list2.add(20);
        list2.add(30);
        System.out.println("List 1 is : " + list1);
        System.out.println("Size of list 1 is : " + list1.size());
        System.out.println("Does list 1 contains 200 ? " + list1.contains(200));
        list1.remove(Integer.valueOf(1));
        System.out.println("Removed 1 from list 1 : " + list1);
        System.out.println("List 2 is : " + list2);
//        list1.addAll(list2);
//        System.out.println("Added list 2 in list 1 : " + list1);
//        list1.removeAll(list2);
//        System.out.println("Removed list 2 from list 1 : " + list1);
//        list1.retainAll(list2);
//        System.out.println("Common number in list 1 and list 2 is : " + list1);
        Object[] arr = list1.toArray();
        for (Object e : arr) {
            // Integer temp = (Integer) e;
            System.out.println(e);
        }
        System.out.println(list1);
    }    
}
