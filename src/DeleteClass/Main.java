package DeleteClass;
public class Main {
    public static void main(String[] args) {
        StudentData student = new Student("Aman", 12);
        student.getInfo();
    }
}
abstract class StudentData {
    String name;
    int id;

    StudentData(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract public void getInfo();
}

class Student extends StudentData{
    Student(String name, int id) {
        super(name, id);
    }
    @Override
    public void getInfo() {
        System.out.println("Hello, "+ this.name + " :)");
        System.out.println("ID Number: "+ this.id);
    }
}