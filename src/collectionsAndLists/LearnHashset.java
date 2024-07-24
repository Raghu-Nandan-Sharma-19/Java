package collectionsAndLists;

import java.util.*;

public class LearnHashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("Set is : " + set);
        System.out.println("Removing 20 from set : " + set.remove(20));
        System.out.println("Set is : " + set);
        System.out.println("Does set contains 40 ? " + set.contains(40));
    }
}
