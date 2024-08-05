import java.util.HashSet;
import java.util.Set;

public class HashCodeExample2 {
    public static void main(String[] args) {
        Student s1 = new Student(10 , "Sara");
        Student s2 = new Student(10 , "sara");
        Student s3 = new Student(10 , "Sara");
        Student s4 = new Student(15 , "Sara");

        System.out.println("HashCode of s1 = "  + s1.hashCode());
        System.out.println("HashCode of s2 = "  + s2.hashCode());
        System.out.println("HashCode of s3 = "  + s3.hashCode());
        System.out.println("HashCode of s4 = "  + s4.hashCode());

        System.out.println("______________________");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("______________________");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println("______________________");

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students.size());

    }
}
