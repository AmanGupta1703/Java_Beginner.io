package Collection.ArrayDeque;

import java.util.ArrayDeque;    // ArrayDeque concrete Class
import java.util.Deque; // Deque Interface

public class Main {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(12);
        arrayDeque.add(52);
        arrayDeque.add(45);

        System.out.println("First Element: "+ arrayDeque.peekFirst()); // to get a first element
        System.out.println("Last Element: "+ arrayDeque.peekLast()); // to get a last element

        System.out.println("Removing First Element: "+ arrayDeque.pollFirst()); // to get a first element
        System.out.println("Removing Last Element: "+ arrayDeque.pollLast()); // to get a last element

        System.out.println(arrayDeque);
    }
}
