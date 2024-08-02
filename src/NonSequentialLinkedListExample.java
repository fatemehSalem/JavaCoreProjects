import java.util.LinkedList;

public class NonSequentialLinkedListExample {
    //Non Sequential Addition
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2,2);
        for(Integer i : list)
            System.out.println(i);
    }
}
