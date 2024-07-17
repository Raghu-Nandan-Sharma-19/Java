package oops3.learnPackage;

public class Teacher {
    String name; // cannot be accessed in different packages
    
    private int id; // cannot be accessed anwhere outside this class

    protected int age; // cannot be accessed in different package non subclass

    public int className; // can be accesed anywhere

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.name = "Ajit";
        teacher1.id = 2231;
        teacher1.age = 70;
        teacher1.className = 12;
        System.out.println("Id of teacher is : " + teacher1.id);
    }
}
