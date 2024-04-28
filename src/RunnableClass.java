
import java.util.Arrays;

public class RunnableClass {


    public static int maxGap(int[] A) {
        int n = A.length;
        MyArray[] myArrays = new MyArray[n];

        for (int i = 0; i < n; i++) {
            myArrays[i] = new MyArray(A[i], i);
        }

        Arrays.sort(myArrays);

        int maxGap = 0;

        for (int i = 1; i < n; i++) {
            if(myArrays[i].number == myArrays[i-1].number){
                maxGap = Math.max(maxGap, myArrays[i].index - myArrays[i-1].index);
            } else{
                maxGap = Math.max(maxGap, myArrays[i].index );
            }
        }

        return maxGap;
    }
    public static void main(String[] args) {
        int[] arr = {1,  9 , 2, 5, 6, 2, 1, 1, 9, 2};


        int result = maxGap(arr);
        System.out.println("Maximum possible gap: " + result);
    }
}
