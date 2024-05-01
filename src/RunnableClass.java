import java.util.Arrays;

public class RunnableClass {

    private static void mergeSort(int[] arr , int left , int right){
        if(left < right){
            int mid = ( right + left ) / 2 ;

            mergeSort(arr  , left , mid);
            mergeSort(arr , mid + 1 , right);

            mergeFunc(arr , left , mid , right);
        }
    }
    private static  void mergeFunc(int[] arr , int left , int mid , int right){
        int n = mid - left + 1;
        int m = right - mid;
        int i, j, k = left;

        int[] leftArr = new int[n];
        int[] rightArr = new int[m];

        for(i = 0 ; i < n ; i++)
            leftArr[i] = arr[left + i];
        for(j = 0 ; j < m ; j++)
            rightArr[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;

        while(i < n && j < m){
            if(leftArr[i] < rightArr[j]){
                arr[k] = leftArr[i];
                i++;

            } else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < m) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 7 , 5 , 13 , 22 , 10};
        mergeSort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}


