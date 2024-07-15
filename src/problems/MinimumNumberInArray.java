package problems;

import java.util.Scanner;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        System.out.println("Enter " + size + " elements : ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        int minimumNumber = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minimumNumber) {
                minimumNumber = number;
            }
        }
        System.out.println("Minimum number in array is : " + minimumNumber);
        in.close();
    }
}