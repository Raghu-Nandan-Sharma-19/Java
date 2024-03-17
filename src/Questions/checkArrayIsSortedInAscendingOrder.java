package Questions;

import java.util.Scanner;

public class checkArrayIsSortedInAscendingOrder {
    public static void checkArray(int[] arr) {
        boolean isAscending = true;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>arr[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i=0; i<size; i++) {
            numbers[i] = in.nextInt();
        }
        checkArray(numbers);
    }
}
