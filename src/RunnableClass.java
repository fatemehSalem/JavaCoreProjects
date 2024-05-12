import java.util.*;

public class RunnableClass {
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();

        list.add(new Student(12 , "John"));
        list.add(new Student(9 , "Ali"));
        list.add(new Student(23 , "Mark"));
        list.add(new Student(11 , "Sarah"));

        Collections.sort(list);

        for(Student i : list)
            System.out.println(i);

    }
}

