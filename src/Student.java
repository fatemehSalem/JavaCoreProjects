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

    @Override
    public int compareTo(Student other) {
        return  this.name.compareToIgnoreCase(other.name);
    }

}
