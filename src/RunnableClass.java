import java.util.Arrays;

public class RunnableClass {


    public static int[] sort(int[] arr) {
        Arrays.sort(arr);

        return  arr;
    }
    public static void main(String[] args) {
        int[] x = {0 , 2 , 1 , 2 , 0};
        int[] result = sort(x );
        System.out.println("number of pairs is: " + Arrays.toString(result));
    }

}


