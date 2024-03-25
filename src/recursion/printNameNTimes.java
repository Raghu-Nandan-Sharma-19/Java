package recursion;

import java.util.Scanner;

public class printNameNTimes {
    static int count = 1;
    public static void print(String name, int n) {
        if(count>n) return;
        System.out.println(name);
        count++;
        print(name, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = in.nextLine();
        System.out.println("How many times do you want to print name : ");
        int numberOfTimes = in.nextInt();
        print(name, numberOfTimes);
    }

}
