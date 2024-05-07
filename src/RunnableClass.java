import java.util.HashMap;
import java.util.Map;

public class RunnableClass {
    public static String findIndexes(int[] arr, int s) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == s)
                return "1" + (i + 1);
            if (map.containsKey(sum - s))
                return (map.get(sum - s) + 1) + "" + (i + 1);
            map.put(sum, i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int s = 15;
        String result = findIndexes(arr , s);
        if(result != null)
            System.out.println("The sum of elements from " + result.charAt(0) + "st position to " + result.charAt(1) + "st position");
        else
            System.out.println("The result has not been found!");
    }
}
