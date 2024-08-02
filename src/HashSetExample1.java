import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<ArrayList> hashSet = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(2);
        list2.add(1);
        hashSet.add(list1);
        hashSet.add(list2);
        hashSet.forEach(arrayList -> {
            arrayList.forEach(System.out::println);
        });


       System.out.println(hashSet.size());
    }
}
