import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // first way
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 85;

        // Second way
//        int[] marks = {98, 97, 95};

        // third way --> user input
        System.out.println("Enter total numbers : "); // --> size of the array
        int size = in.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter "+size+" numbers : ");
        for(int i=0; i<size; i++) {
            System.out.print("Enter number "+(i+1)+" : ");
            numbers[i] = in.nextInt();
        }
        System.out.println("Printing numbers : ");
        for(int i=0; i<size; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
