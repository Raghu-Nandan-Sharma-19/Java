package basicMaths;

import java.util.*;

import static java.lang.Math.sqrt;

public class printAllDivisors {
    public static void printDivisors(int n) {
//        Alternate way
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
        /*ArrayList<Integer> ls = new ArrayList<>();
        for(int i=1; i<=sqrt(n); i++) {
            if(n%i==0) {
                ls.add(i);
            }
            if(n/i!=i) {
                ls.add(n/i);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);*/
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = in.nextInt();
        printDivisors(number);
    }
}
