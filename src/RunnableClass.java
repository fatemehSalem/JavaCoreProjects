import com.sun.source.tree.Tree;

import java.util.*;

public class RunnableClass {

    public static void main(String[] args)
    {
        HashMap<String , Integer> hashMap = new HashMap<>();
        hashMap.put("Ali" , 1);
        hashMap.put("Mohammad-Javad" , 2);
        hashMap.put("Mohammad-Mahdi" , 3);

        hashMap.putIfAbsent("Mohammad-Mahdi" , 16);

        hashMap.put("Mohammad-Mahdi" , 16);

        for(String key : hashMap.keySet()){
            System.out.println(key + " : "  + hashMap.get(key)  );
        }
    }
}

