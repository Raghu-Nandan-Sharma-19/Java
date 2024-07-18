package oops3.learnStatic;

public class Children {
    String name;

    private int age;

    public static int count = 0;

    public Children() {
        count++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
