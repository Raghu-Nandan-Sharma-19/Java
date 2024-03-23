package javaCollectionsFramework;

import java.util.Arrays;

public class arrayClass {
    public static void main(String[] args) {
       /* int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of binary search is : " + index);*/
        Integer[] numbers = {32, 2, 10, 14, 75, 48, 79};
        Arrays.sort(numbers);
        Arrays.fill(numbers, 12);
        for(int i : numbers) {
            System.out.print(i+" ");
        }
    }
}
