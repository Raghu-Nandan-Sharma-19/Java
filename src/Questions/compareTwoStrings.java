package Questions;

import java.util.Scanner;

public class compareTwoStrings {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2)==0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
//        if(name1.equals(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//        // DO NOT USE == to check string equality
//        // Gives correct answer here
//        if(name1==name2) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }
//        // Gives incorrect answer here
//        if(new String("Tony")==new String("Tony")) {
//            System.out.println("They are same string");
//        } else {
//            System.out.println("They are different strings");
//        }
    }
}
