
import java.util.ArrayList;
import java.util.Arrays;

public class RunnableClass {


    public static int maxSum(int[] arr) {
        int maxSum = 0;
        ArrayList<Integer> sumArray = new ArrayList<>();
        for (int j : arr) {
            maxSum = maxSum + j;
            sumArray.add(maxSum);
        }
        Integer[] sumArrayAsArray = sumArray.toArray(new Integer[0]);

        Arrays.sort(sumArrayAsArray);

        return sumArrayAsArray[sumArrayAsArray.length - 1];

    }
    public static void main(String[] args) {
        int[] arr = {-1 , -2 , -3 , -4};

        int result = maxSum(arr);
        System.out.println("Maximum Sum: " + result);
    }
}
