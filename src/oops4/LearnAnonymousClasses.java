package oops4;

public class LearnAnonymousClasses {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass() {
            public void outerMethod() {
                System.out.println("Hi, I am outer method");
            }
        }; 
        
        SuperInterface obj2 = new SuperInterface() {
            @Override
            public void interfaceMethod() {
                System.out.println("Hi, I am interface method");
            }
        };
        obj1.outerMethod();
        obj2.interfaceMethod();
    }
}

class OuterClass {
    public void outerMethod() {

    }
}

interface SuperInterface {
    void interfaceMethod();
}