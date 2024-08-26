import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        treeSet1.add(1);
        treeSet1.add(2);
        treeSet1.add(4);
        treeSet1.add(6);
        treeSet1.add(7);

        Iterator<Integer> iterator = treeSet1.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}
