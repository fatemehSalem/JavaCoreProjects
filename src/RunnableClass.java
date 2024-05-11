import java.util.*;

public class RunnableClass {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();

        list.add(52);
        list.add(21);
        list.add(20);
        list.add(55);
        list.add(51);

        list.sort((o1, o2) -> o1 % 10 > o2 % 10 ? 1: -1);

        for(Integer i : list){
            System.out.println(i);
        }
    }
}

