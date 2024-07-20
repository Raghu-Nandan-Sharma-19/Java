package oops5;

class Data {
    int data;
    public void printData() {
        System.out.println(data);
    }
    public void printData(int times) {
        for (int i = 0; i < times; i++) System.out.println(data);
    }
}

class ChildData extends Data {
    @Override
    public void printData() { 
        System.out.println("Overridden " + data);
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        Data data1;
        data1 = new ChildData();
        data1.printData();  // runtime polymorphism aka method overriding

        Data data2 = new Data();
        data2.printData(5);  // compile time polymorphism aka method overloading
    }
}
