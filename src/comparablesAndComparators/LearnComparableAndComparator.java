package comparablesAndComparators;
import java.util.*;
class MyCustomComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(2, "Shishimaru", 6);
        Animal a4 = new Animal(3, "Don", 3);
        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        System.out.println(dogs);
        dogs.sort(new MyCustomComparator());
        System.out.println(dogs);
    }
}
