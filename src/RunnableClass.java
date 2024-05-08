import java.util.Arrays;

public class RunnableClass {
    public static int countTriplets(int[] arr) {
        int sum, count = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                    sum = arr[i] + arr[j];
                if (binarySearch(arr, sum) != -1) {
                    count++;
                }
            }
        }
        return count;
      
    }
    public static int binarySearch(int[] arr, int x) {
            int left = 0, right = arr.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] < x)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2};
        System.out.println("There are " + countTriplets(arr) + " triplets");
    }

}


