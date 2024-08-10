import java.util.ArrayList;
import java.util.List;

public class RunGenerics {
    public static void main(String[] args) {
    Box<Integer , Double> box = new Box<>(10 , 20.08 , "Number 20");

    System.out.println(box.getBoxName() + " , " + box.getExternalItem() + " , " + box.getItem());

    Integer[] intArray = {1, 2, 3, 4};
    Box.printArray(intArray);
        List<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        d.add(4);
    Box.addToList(d);

    Box.processNumbers(10.55555);
    }
}
