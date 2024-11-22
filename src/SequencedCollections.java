import java.util.*;

public class SequencedCollections {
    public static void main(String[] args) {
        printInternalOrderExample();
        externalInternalOrderExample1();
        externalInternalOrderExample2();
        coreOperationExample();
    }


    static void  printInternalOrderExample(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        System.out.println(treeSet);
        System.out.println("_______________");
    }

    static void  externalInternalOrderExample1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");
        System.out.println(list);
        System.out.println("_______________");
    }

     static void externalInternalOrderExample2() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        linkedHashSet.add("C");
        System.out.println(linkedHashSet);
        System.out.println("_______________");
    }

    static void coreOperationExample(){
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.addFirst("First");
        deque1.addLast("Last");
        //deque.removeFirst();
        //deque.removeLast();
        System.out.println("with ArrayDeque impl:" + deque1);

        Deque<String> deque3 = new LinkedList<>();
        deque3.addFirst("First");
        deque3.addLast("Last");
        System.out.println("with LinkedList impl:" + deque3);


    }
}
