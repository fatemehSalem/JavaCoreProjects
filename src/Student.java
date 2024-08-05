import java.util.Objects;

public class Student implements Comparable<Student> {
    public int age;
    public String name;

    public Student(int age , String name ){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + age +
                ", name='" + name + '\'' +
                '}';
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/

    @Override
    public int compareTo(Student other) {
        return  this.name.compareToIgnoreCase(other.name);
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }*/


}
