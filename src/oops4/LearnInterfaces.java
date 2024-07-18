package oops4;

public class LearnInterfaces {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        monkey1.eats();
        monkey1.dance();        
    }
}

interface Animal {
    void eats();
} 

interface Pet {
    void dance();
}

class Monkey implements Animal, Pet {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void dance() {
        System.out.println("Monkey is dancing");
    }
}