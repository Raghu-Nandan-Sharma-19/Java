package Questions;

import java.util.Scanner;

public class minimumAndMaximumValueInArray {
    public static void minAndMaxValue(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value in array is : "+max);
        System.out.println("Minimum value in array is : "+min);
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
        minAndMaxValue(numbers);
    }
}
