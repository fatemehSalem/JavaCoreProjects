import java.util.Arrays;

public class RunnableClass {

    public static void  quickSort(int[] arr , int low , int high) {
        if(low < high){
            int pi = partition(arr , low , high);
            quickSort(arr , low , pi - 1);
            quickSort(arr , pi + 1 , high);
        }
    }

    public static int partition(int[] arr , int low , int high){
        int pi = arr[high];
        int i = low -1 ;

         for(int j = low ; j < high ; j++){
             if(arr[j] < pi){
                 i ++ ;
                 swap(arr , i , j);
             }
         }
         swap(arr , i + 1 , high);
         return i+1;
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10 , 2  , 13 , 7 , 11 , 3 , 9};
        int k = 4;
        quickSort(arr ,  0 , arr.length -1);
        System.out.println("kth smallest element is: " + arr[k - 1]);
    }

}


