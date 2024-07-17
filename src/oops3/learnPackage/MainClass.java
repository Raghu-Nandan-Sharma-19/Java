package oops3.learnPackage;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Rajider";
        teacher1.age = 80;
        teacher1.className = 1;
        System.out.println("Name of teacher is : " + teacher1.name);
        System.out.println("Age of teacher is : " + teacher1.age);
        System.out.println("Class of teacher is : " + teacher1.className);        
    }
}
