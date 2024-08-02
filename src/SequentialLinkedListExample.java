import java.util.LinkedList;

public class SequentialLinkedListExample {
    public static void main(String[] args) {
        //Sequential Addition
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list)
            System.out.println(i);
    }
}
