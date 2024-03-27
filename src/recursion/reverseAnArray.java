package recursion;

import java.util.Scanner;

public class reverseAnArray {
    // Two pointer approach
    /*public static void reverse(int[] arr, int start, int end) {
        if(start>=end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start = start+1, end = end-1);
    }*/
    // One variable approach
    public static void reverse(int[] arr, int i, int size) {
        if(i>=size/2) {
           return;
        }
        int temp = arr[i];
        arr[i] = arr[size-i-1];
        arr[size-i-1] = temp;
        reverse(arr, i+1, size);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i=0; i<size; i++) {
            numbers[i] = in.nextInt();
        }
        // two pointer method recursion call
        /*reverse(numbers,0, size-1);
        for(int i=0; i<size; i++) {
            System.out.print(numbers[i]+" ");
        }*/
        // One variable method recursion call
        reverse(numbers, 0, size);
        System.out.println("After reversing array : ");
        for(int i=0; i<size; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
