import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> strings = new TreeSet<>();
        strings.add("Sara");
        strings.add("Behrouz");
        strings.add("Akram");
        strings.add("Zahra");
        strings.forEach(System.out::println);
    }
}
