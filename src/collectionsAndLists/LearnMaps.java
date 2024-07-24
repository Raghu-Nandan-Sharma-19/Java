package collectionsAndLists;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMaps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("US", "United States");
        map.put("IN", "India");
        map.put("UK", "United Kingdom");
        map.put("ES", "Spain");
        System.out.println(map);
        map.remove("US");
        System.out.println(map.containsKey("pn"));
        System.out.println(map);
        System.out.println(map.get("US"));
        System.out.println(map.getOrDefault("US", "Others"));
        System.out.println(map.containsValue("India"));

        Set<String> keys = map.keySet();
        System.out.println(keys);
    }
}
