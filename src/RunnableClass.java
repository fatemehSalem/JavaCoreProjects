import java.util.Arrays;

public class RunnableClass {

    public static int[]  reverseArray(int[] arr , int subArrayLength) {
        int temp ;
        for(int i = 0 ; i < subArrayLength ; i++){
            if(arr[i] < arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        return  arr;
    }

    public static void main(String[] args) {
        int[] arr = {1 , 3 , 2 , 10 , 13};
        int[]  minPlatforms = reverseArray(arr , 3);
        System.out.println("Minimum number of platforms is: " + Arrays.toString(minPlatforms));
    }

}


