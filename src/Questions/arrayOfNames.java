package Questions;

import java.util.Scanner;

public class arrayOfNames {
    public static void printNames(String[] names) {
        System.out.println("The names are : ");
        for(int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total numbers of names : ");
        int size = in.nextInt();
        String[] names = new String[size];
        System.out.println("Enter "+size+" names : ");
        for(int i=0; i<size; i++) {
            names[i] = in.next();
        }
        printNames(names);
    }
}
