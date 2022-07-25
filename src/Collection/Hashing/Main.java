package Collection.Hashing;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(5,0.26f);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        System.out.println(hashSet);
    }
}
// Hashing => to convert Key-Value pairs to Indices
// Hashing technique => for fast searching and inserting in an existing HashTable.