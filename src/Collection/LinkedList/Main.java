package Collection.LinkedList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);

        for(Integer link: linkedList) {
            System.out.print(link + " ");
        }

        System.out.println("\n" + linkedList.peek());
        System.out.println(linkedList.poll());  // removes the first element
        System.out.println(linkedList.pop());

        System.out.println(linkedList);
    }
}
