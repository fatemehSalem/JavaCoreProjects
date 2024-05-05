import java.util.Arrays;

public class RunnableClass {

    public static void  reverseArray(int[] arr , int low , int k) {
        if(low < k){
            int pi = partition(arr , low , k);
            reverseArray(arr , pi + 1 , k);
        }
    }

    public static int partition(int[] arr , int low , int k){
        int pi = arr[k];
        int i = low -1 ;

         for(int j = low ; j < k ; j++){
             if(arr[j] > pi){
                 i ++ ;
                 swap(arr , i , j);
             }
         }
         swap(arr , i + 1 , k);
         return i+1;
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10 , 2  , 13 , 7 , 11 , 3 , 9};
        int k = 5;
        reverseArray(arr ,  0 ,  k -1);
        reverseArray(arr ,  k ,  arr.length - 1);
        System.out.println("Minimum number of platforms is: " + Arrays.toString(arr));
    }

}


