package AdvJavaPracticeSet2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    @SuppressWarnings("deprication")    // => Question 3
    public static void main(String[] args) throws IOException {
        // Question 2
        Dog dog = new Dog();
        dog.speak();

        // Question 4
        HumanBeing Aman = () -> {
            System.out.println("Walking...");
        };
        Aman.toWalk();

        // Question 5 & 6 (have the same solution) => creating a file
        int number = 5;
        String table = " ";
        for(int i = 2; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                table += i + "X" + j + "=" + (i*j);
                table += "\n";
            }
        }
            File file = new File("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\AdvJavaPracticeSet2\\Multiply.txt");
            file.createNewFile();

        FileWriter fileWriter = new FileWriter("C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\AdvJavaPracticeSet2\\Multiply.txt");
        fileWriter.write(table);
        fileWriter.close();
        System.out.println(table);
    }
}
class Dog {
    @Deprecated
    public void speak() {
        System.out.println("*Woof* *Woof*");
    }
}
interface HumanBeing {
    void toWalk();
}