package genericsAndWrapperClass;

public class Generics {
    public static void main(String[] args) {
        Dog<String, String> dog1 = new Dog<>("asdf123", "Shishimaru");
        Dog<String, String> dog2 = new Dog<>("oeiur12", "Shiro");

        Dog<Integer, String> dog3 = new Dog<>(12, "Bob");

        System.out.println("Id and name of dog 1 is : " + dog1.id + " " + dog1.name);
        System.out.println("Id and name of dog 2 is : " + dog2.id + " " + dog2.name);
        System.out.println("Id and name of dog 3 is : " + dog3.id + " " + dog3.name);
    }
}
class Dog<E, v> {
    E id;
    V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;
    }

    V getName() {
        return name;
    }
}