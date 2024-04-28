
import java.util.Arrays;

public class RunnableClass {


    public static int maxMissingNumber(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] + 1 != arr[i + 1])
                return arr[i] + 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = { -1 , 2 , 0 , 3};

        int result = maxMissingNumber(arr);
        System.out.println("missing number is: " + result);
    }
}

