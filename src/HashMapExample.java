import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("Student1" , 20);
        map.put("Student2" , 18);
        map.putIfAbsent("Student3" , 16);
        map.putIfAbsent("Student1" , 19);
        map.put("Student1" , 14);

        map.forEach((s, integer) -> System.out.println(s + " : " + integer));
    }
}
