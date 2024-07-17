package oops;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dog dog1 = new Dog();
        System.out.println("Enter name of Dog 1 : ");
        dog1.name = in.nextLine();
        Dog dog2 = new Dog();
        System.out.println("Enter name of Dog 2 : ");
        dog2.name = in.nextLine();
        dog1.walk();
        dog2.bark();
        in.close();
    }
}
class Dog {
    String name;
    String color;
    void walk() {
        System.out.println(name + " is walking");
    }
    void bark() {
        System.out.println(name + " is barking");
    }
}