package Annotation.Genrics;

// Generic => Introduced from JDK 5.0
// aim to reduce bugs and enhance type safety

public class Main {
    public static void main(String[] args) {
        Generic<String, Integer> object = new Generic(12, "String", "Integer");
        System.out.println(object.getThing_1());
        System.out.println(object.getThing_2());
    }
}

class Generic<T1,T2> {
    int value;
    private T1 thing_1;
    private T2 thing_2;

    public Generic(int value, T1 thing_1, T2 thing_2) {
        this.value = value;
        this.thing_1 = thing_1;
        this.thing_2 = thing_2;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public T1 getThing_1() {
        return thing_1;
    }

    public void setThing_1(T1 thing_1) {
        this.thing_1 = thing_1;
    }

    public T2 getThing_2() {
        return thing_2;
    }

    public void setThing_2(T2 thing_2) {
        this.thing_2 = thing_2;
    }
}