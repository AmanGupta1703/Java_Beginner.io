package Serializable;
import java.io.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student("Aman", 12);
        student.setRollNumber(12);

        String fileName = "C:\\Users\\Kunal\\IdeaProjects\\JavaProjects\\src\\Serializable\\Kunal File.txt";

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        // Serialization
        try {
            fileOutputStream  = new FileOutputStream(fileName);     //
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);    //Write the student object to fileName

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized: "+ student);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Deserialization
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream); // read this file

            Student object = (Student) objectInputStream.readObject(); // we've to explicitly cast it to Student class since the during the serialization, is lost

            objectInputStream.close();
            fileInputStream.close();

              System.out.println("object has been deserialized: "+ object);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int id;
    transient int rollNumber;
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return ("Student Name: "+ this.name +
                ", " + "Student ID: "+ this.id);
    }
}
