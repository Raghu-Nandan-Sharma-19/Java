package Questions;

import java.util.Scanner;

public class searchNumberInArray {
    public static void searchNumber(int[] numbers, int x) {
        boolean found = false;
        for(int i=0; i<numbers.length; i++) {  // --> numbers.length is size of the array
            if (numbers[i]==x) {
                System.out.println("Found at index : "+i);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Not found");
        }
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
        System.out.println("Enter the number to find : ");
        int findNumber = in.nextInt();
        searchNumber(numbers, findNumber);
    }
}
