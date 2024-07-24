package collectionsAndLists;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Student {
    int rollNo;
    String name;
    public Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
public class HashsetOfCustomObjects {
    public static void main(String[] args) {
        Set<Student> set= new HashSet<>();
        set.add(new Student(1, "Anuj"));
        set.add(new Student(2, "Raghu"));
        set.add(new Student(2, "Rohan"));
        System.out.println("Set is : " + set);
    }
}
