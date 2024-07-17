package oops3.learnPackage;

public class Person {

    private int age;
    
    boolean canBeChanged = true;

    public void setAge(int age) {  // setter function to set age 
        if(canBeChanged == true) {
            if(age > 0) {
                this.age = age;
            }
        }
    }

    boolean canBeAccesed = true;
    public int getAge() {  // getter function to get age
        if(canBeAccesed) {
            return age;
        }
        return -1;
    }
}