package Annotation;
// Annotations provides metadata(information about some information) to class/methods
public class Main {
    @SuppressWarnings("deprication")
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.toSpeak();
       dog.toWalk();
    }
}
class Animal {
    public void toSpeak() {
        System.out.println("Animal is speaking");
    }
}
class Dog extends Animal {

    @Override
    public void toSpeak(){
        System.out.println("Dog is barking *woof* *woof*");
    }
    @Deprecated
    public void toWalk() {
        System.out.println("Dog is walking.");
    }
}

@FunctionalInterface // => an interface that contains only one abstract method
interface myInterface {
    void display();
}
