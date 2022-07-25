package Annotation.AnnoymousNLambdaExpression;

// Lambda expression => Added in java 8

public class Main {
    public static void main(String[] args) {
        // Anonymous Class
        Animal dog = new Animal() {
            @Override
            public void toSpeak() {
                System.out.println("*woof* *woof*");
            }

            @Override
            public void toWalk() {
                System.out.println("Walking...");
            }
        };
        dog.toSpeak();
        dog.toWalk();

        // Lambda Expression

        Phone phone = (name) -> {
            System.out.println("Calling "+ name + "...");
        };
        phone.toCall("Aman");
    }
}
interface Animal {
    void toSpeak();
    void toWalk();
}

@FunctionalInterface
interface Phone {
    void toCall(String name);
}
