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
        System.out.println("***************************");
        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(11);
        integers.add(2);
        integers.add(22);
        integers.add(12);
        integers.forEach(System.out::println);
    }
}
