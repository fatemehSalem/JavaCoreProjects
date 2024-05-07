import java.util.Arrays;
public class RunnableClass {
    public static void main(String[] args) {
        String[] arr = {"650", "70", "98", "79"};

        Arrays.sort(arr, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });

        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }
        System.out.println("Largest possible number: " + result);
    }
    }




