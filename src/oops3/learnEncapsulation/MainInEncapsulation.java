package oops3.learnEncapsulation;

import java.util.Scanner;

import oops3.learnPackage.Person;

public class MainInEncapsulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Person person1 = new Person();

        System.out.println("Enter age of person : ");
        int age = in.nextInt();

        person1.setAge(age);  // sets the age in setter function of package Person

        // gets the age from getter function of package Person
        System.out.println("Age of the person is : " + person1.getAge());

        in.close();
    }
}
