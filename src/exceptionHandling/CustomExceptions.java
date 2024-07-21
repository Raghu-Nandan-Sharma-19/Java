package exceptionHandling;

import java.util.Scanner;

public class CustomExceptions {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age : ");
        
        try {
            int age = in.nextInt();
            if(age > 100) {
                throw new MyException("Age above 100 not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        in.close();
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}