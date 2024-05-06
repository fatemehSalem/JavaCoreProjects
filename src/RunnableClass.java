import java.util.Arrays;

public class RunnableClass {
    public static int[] zigZag(int[] arr) {
        int n = arr.length, mid = n / 2 , increment = 1 ;

        Arrays.sort(arr);

        int[] tempArray = new int[n];

        for(int i = 0 ; i < mid ; i++){
            tempArray[2 * i] = arr[i];
        }

        for(int k = n - 1 ; k >= mid ; k--){
            tempArray[increment] = arr[k];
            increment = increment +2;
        }
        return tempArray;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 8, 6, 2, 1};
        System.out.println("Is there a Pythagorean triplet? "  + Arrays.toString(zigZag(arr)));
    }

}


