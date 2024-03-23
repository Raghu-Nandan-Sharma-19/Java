package javaCollectionsFramework;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
//        if(numbers.containsKey("Two")) {
//            numbers.put("Two", 23);
//        }
        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);

        for(Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());

            for(String key : numbers.keySet()) {
                System.out.println(e);

                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }
        }
        System.out.println(numbers.containsValue(3));
    }
}
