package oops5;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
    }

    @Override
    public String toString() {
        return "Model : " + model + ", Year : " + year;
    }

    @Override
    public boolean equals(Object obj) {
        Car that = (Car) obj;
        if(this.model.equals(that.model) && this.year == that.year) return true;
        return false;
    }
}
public class LearnObjectClass {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Fortuner" , 2024);
        Car car2 = new Car("Toyota Fortuner", 2024);
        
        System.out.println(car1.equals(car2));
        
        System.out.println(car1);
        
        System.out.println(car1.hashCode());
    }
}