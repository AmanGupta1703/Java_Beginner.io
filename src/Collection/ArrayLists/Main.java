package Collection.ArrayLists;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        arrayList.forEach(s -> System.out.println(s));  // Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.

        List<Integer> subArrayList = arrayList.subList(3, 6);   //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println("#2 ArrayList: "+ subArrayList);
    }
}
