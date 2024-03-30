package sorting;

import java.util.Scanner;

public class selectionSort {
    public static void display(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Before selection sort : ");
        display(arr, size);
        System.out.println();
        selection_sort(arr, size);

    }
}
