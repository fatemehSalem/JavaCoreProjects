import java.util.*;

public class RunnableClass {
    public static void main(String[] args)
    {

//        String s1 = new String("HI");
//        String s2 = new String("HI");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        Student s1 = new Student(3 , "Negar");
        Student s2 = new Student(3 , "Negar");
        Student s3 = new Student(3 , "Negarr");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

//        List<Student> list = new ArrayList<>();
//        list.add(new Student(12 , "John"));
//        list.add(new Student(9 , "Ali"));
//        list.add(new Student(23 , "Mark"));
//        list.add(new Student(11 , "Sarah"));
//
//        Collections.sort(list);
//        for(Student i : list)
//            System.out.println(i);
    }
}


