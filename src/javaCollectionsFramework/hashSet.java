package javaCollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println(set);

        set.remove(54); // removes element from the set

        System.out.println(set);

        System.out.println(set.contains(2));

        System.out.println(set.isEmpty()); // checks if the set is empty or not

        System.out.println(set.size()); // returns the size of the set

        System.out.println(set);

        set.clear(); // clears all the elements in the set
        System.out.println(set);
        // Time complexity --> O(1)
    }
}
