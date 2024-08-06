import java.util.Enumeration;
import java.util.Hashtable;

public class HashMapExample3 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        Enumeration<String> enumeration = hashtable.keys();

        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();

            hashtable.put("key3", "value3");
            hashtable.put("key2", "newValue_value2");

            System.out.println(key);
        }
    }
}
