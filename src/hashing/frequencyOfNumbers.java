package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class frequencyOfNumbers {

    /* without map
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = in.nextInt();
        }
        // pre-compute
        int[] hash = new int[13];
        for(int i=0; i<size; i++) {
            hash[arr[i]]+=1;
        }
        int q = in.nextInt();
        while(q--!=0) {
            int number = in.nextInt();
            // fetch
            System.out.println(hash[number]);
        }
    }*/
    // using map
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = in.nextInt();
        }
        // pre-compute
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i=0; i<size; i++) {
            int key = arr[i];
            int freq = 0;
            if(numbers.containsKey(key)) freq = numbers.get(key);
            freq++;
            numbers.put(key, freq);
        }
        // Iterate over the map:
        /*
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        */
        int q = in.nextInt();
        while(q--!=0) {
            int number = in.nextInt();
            if(numbers.containsKey(number)) System.out.println(numbers.get(number));
            else System.out.println(0);
        }
    }
}
