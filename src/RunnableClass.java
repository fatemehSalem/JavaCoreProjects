import java.util.Arrays;

public class RunnableClass {

    private static void  quickSort(int[] arr , int low , int high) {
        if(low < high){
            int pi = partition(arr ,  low , high);
            quickSort(arr, low , pi -1); // for sorting and partitioning the right side
            quickSort(arr , pi + 1 , high); // for sorting and partitioning the left side
        }
    }
    private static int partition(int[] arr , int low , int high){
        int pivot = arr[high] , i = low - 1;
        for(int j = low ; j < high ; j++){
            if(arr[j] > pivot){ //descending
            // if(arr[j] < pivot){ //ascending
                i++;
                swap(arr , i , j);
            }
        }
        swap(arr , i+1 , high);
        return i+1;
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 7 , 5 , 13 , 22 , 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}


