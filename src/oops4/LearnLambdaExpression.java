package oops4;

public class LearnLambdaExpression {
    public static void main(String[] args) {

        SuperInterface obj = () -> {   // this is a lambda expression
            System.out.println("Hi, I am interface method made using lamda expression");
        };

        obj.interfaceMethod();
    }
}

@FunctionalInterface    
interface SuperInterface {
    void interfaceMethod();
}